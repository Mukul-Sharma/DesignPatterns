package factory;

import impl.BaseComputer;

/**
 * Created by mukul_sharma on 18/06/16.
 * Built with Love
 */
public abstract class ComputerFactory {

    public enum ComputerType {
        DESKTOP, TOWER
    }

    public static ComputerFactory newFactory(ComputerType computerType) {
        switch (computerType) {
            case DESKTOP:
                return new DesktopComputerFactory();
            case TOWER:
                return new TowerComputerFactory();
            default:
                return new DesktopComputerFactory();
        }
    }

    public abstract BaseComputer makeComputer();
}

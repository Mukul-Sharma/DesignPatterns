package factory;

import impl.BaseComputer;

/**
 * Created by mukul_sharma on 18/06/16.
 * Built with Love
 */
public abstract class ComputerPartFactory {

    protected static ComputerPartFactory newFactory(ComputerFactory.ComputerType type) {
        switch (type) {
            case DESKTOP:
                return new DesktopComputerPartFactory();
            case TOWER:
                return new TowerComputerPartFactory();
            default:
                return new DesktopComputerPartFactory();
        }
    }

    abstract BaseComputer.Cabinet makeCabinet();

    abstract BaseComputer.Chassis makeChassis();
}

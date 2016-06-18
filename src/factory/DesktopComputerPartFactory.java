package factory;

import impl.BaseComputer;

/**
 * Created by mukul_sharma on 18/06/16.
 * Built with Love
 */
public class DesktopComputerPartFactory extends ComputerPartFactory {

    @Override
    BaseComputer.Cabinet makeCabinet() {
        return new DesktopComputer.DesktopCabinet();
    }

    @Override
    BaseComputer.Chassis makeChassis() {
        return new DesktopComputer.DesktopChassis();
    }
}

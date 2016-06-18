package factory;

import impl.BaseComputer;

/**
 * Created by mukul_sharma on 18/06/16.
 * Built with Love
 */
public class TowerComputerPartFactory extends ComputerPartFactory {

    @Override
    BaseComputer.Cabinet makeCabinet() {
        return new TowerComputer.TowerCabinet();
    }

    @Override
    BaseComputer.Chassis makeChassis() {
        return new TowerComputer.TowerChassis();
    }
}

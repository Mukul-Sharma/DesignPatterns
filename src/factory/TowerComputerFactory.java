package factory;

import impl.BaseComputer;

/**
 * Created by mukul_sharma on 18/06/16.
 * Built with Love
 */
public class TowerComputerFactory extends ComputerFactory {

    private TowerComputerPartFactory factory = new TowerComputerPartFactory();

    @Override
    public BaseComputer makeComputer() {
        return new TowerComputer(factory.makeCabinet(), factory.makeChassis());
    }
}

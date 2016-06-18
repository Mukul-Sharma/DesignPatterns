package factory;

import impl.BaseComputer;

/**
 * Created by mukul_sharma on 18/06/16.
 * Built with Love
 */
public class DesktopComputerFactory extends ComputerFactory {

    private final DesktopComputerPartFactory factory = new DesktopComputerPartFactory();

    @Override
    public BaseComputer makeComputer() {
        return new DesktopComputer(factory.makeCabinet(), factory.makeChassis());
    }
}

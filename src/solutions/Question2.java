package solutions;

/**
 * Created by mukul_sharma on 18/06/16.
 * Built with Love
 */

import factory.ComputerFactory;
import impl.BaseComputer;

/**
 * To abstract client from detail of creation we can use factory design pattern, this can also be used to ensure
 * client uses correct components during creation
 */
public class Question2 {

    public static void main(String[] args) {
        BaseComputer desktopPC;
        BaseComputer towerPC;
        ComputerFactory factory = ComputerFactory.newFactory(ComputerFactory.ComputerType.DESKTOP);
        desktopPC = factory.makeComputer();
        factory = ComputerFactory.newFactory(ComputerFactory.ComputerType.TOWER);
        towerPC = factory.makeComputer();

        System.out.println(desktopPC);

        System.out.println(towerPC);
    }
}

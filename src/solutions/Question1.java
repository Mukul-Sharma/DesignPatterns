package solutions;

/**
 * Created by mukul_sharma on 18/06/16.
 * Built with Love
 */

import impl.BaseComputer;

/**
 * To treat each component uniformly and create a hierarchy in objects we can use Composite Pattern
 **/
public class Question1 {

    public static void main(String[] args) {
        BaseComputer.Cabinet cabinet = new BaseComputer.Cabinet();
        BaseComputer.Chassis chassis = new BaseComputer.Chassis();
        chassis.addComponent(new BaseComputer.Bus(new BaseComputer.NetworkCard(2, 2), 10, 1));
        chassis.addComponent(new BaseComputer.FloppyDrive(1, 1));
        chassis.addComponent(new BaseComputer.MemoryUnit(2, 2));
        chassis.addComponent(new BaseComputer.CPU(1, 1));
        chassis.addComponent(new BaseComputer.PowerSupply(2, 1));
        BaseComputer computer = new BaseComputer(cabinet, chassis);

        System.out.println("Power Consumption for computer is : " + computer.powerConsumption());
        System.out.println("Price for computer is : " + computer.netPrice());
    }
}

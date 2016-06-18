package impl;

import com.sun.javafx.beans.annotations.NonNull;

/**
 * Created by mukul_sharma on 18/06/16.
 * Built with Love
 */
public class BaseComputer extends BaseComponent {

    public BaseComputer(@NonNull Cabinet mCabinet, @NonNull Chassis mChassis) {
        super(0, 0);
        addComponent(mCabinet);
        addComponent(mChassis);
    }

    @Override
    public String toString() {
        return "Price : " + netPrice() + " | Power : " + powerConsumption();
    }

    public static class Cabinet extends BaseComponent {

        public Cabinet() {
            super(0, 0);
        }
    }

    public static class Chassis extends BaseComponent {

        public Chassis() {
            super(0, 0);
        }
    }

    public static class Bus extends BaseComponent {

        public Bus(@NonNull NetworkCard networkCard, int price, int consumption) {
            super(price, consumption);
            addComponent(networkCard);
        }
    }

    public static class CPU extends BaseComponent {

        public CPU(int price, int powerConsumption) {
            super(price, powerConsumption);
        }
    }

    public static class MemoryUnit extends BaseComponent {

        public MemoryUnit(int price, int powerConsumption) {
            super(price, powerConsumption);
        }
    }

    public static class NetworkCard extends BaseComponent {
        public NetworkCard(int price, int powerConsumption) {
            super(price, powerConsumption);
        }
    }

    public static class PowerSupply extends BaseComponent {
        public PowerSupply(int price, int powerConsumption) {
            super(price, powerConsumption);
        }
    }

    public static class FloppyDrive extends BaseComponent {
        public FloppyDrive(int price, int powerConsumption) {
            super(price, powerConsumption);
        }
    }


}

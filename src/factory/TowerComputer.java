package factory;

import impl.BaseComputer;

/**
 * Created by mukul_sharma on 18/06/16.
 * Built with Love
 */
public class TowerComputer extends BaseComputer {

    protected TowerComputer(Cabinet mCabinet, Chassis mChassis) {
        super(mCabinet, mChassis);
    }

    public static class TowerChassis extends Chassis {

        protected TowerChassis() {
            super();
        }
    }

    public static class TowerCabinet extends Cabinet {

        protected TowerCabinet() {
            super();
        }
    }

    @Override
    public String toString() {
        return "Tower Computer";
    }
}

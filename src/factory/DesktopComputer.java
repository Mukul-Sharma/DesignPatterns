package factory;

import impl.BaseComputer;

/**
 * Created by mukul_sharma on 18/06/16.
 * Built with Love
 */
public class DesktopComputer extends BaseComputer {

    protected DesktopComputer(Cabinet mCabinet, Chassis mChassis) {
        super(mCabinet, mChassis);
    }

    public static class DesktopChassis extends Chassis {

        protected DesktopChassis() {
            super();
        }
    }

    public static class DesktopCabinet extends Cabinet {

        protected DesktopCabinet() {
            super();
        }
    }

    @Override
    public String toString() {
        return "Desktop Computer";
    }
}

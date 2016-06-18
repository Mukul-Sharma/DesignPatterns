package interfaces;

import java.util.List;

/**
 * Created by mukul_sharma on 18/06/16.
 * Built with Love
 */
public interface Component {
    int netPrice();

    int powerConsumption();

    boolean addComponent(Component component);

    boolean removeComponent(Component component);

    List<Component> getComponents();
}

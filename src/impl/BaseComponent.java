package impl;

import interfaces.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mukul_sharma on 18/06/16.
 * Built with Love
 */
public abstract class BaseComponent implements Component {

    private int mNetPrice;
    private int mPowerConsumption;
    private final List<Component> mComponents;

    public BaseComponent(int price, int powerConsumption) {
        this.mNetPrice = price;
        this.mPowerConsumption = powerConsumption;
        this.mComponents = new ArrayList<>();
    }


    @Override
    public int netPrice() {
        int price = mNetPrice;
        for (Component component : mComponents) {
            price += component.netPrice();
        }
        return price;
    }

    @Override
    public int powerConsumption() {
        int consumption = mPowerConsumption;
        for (Component component : mComponents) {
            consumption += component.powerConsumption();
        }
        return consumption;
    }

    @Override
    public boolean addComponent(Component component) {
        return mComponents.add(component);
    }

    @Override
    public boolean removeComponent(Component component) {
        return mComponents.remove(component);
    }

    @Override
    public List<Component> getComponents() {
        return mComponents;
    }

}

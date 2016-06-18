package solutions;

/**
 * Created by mukul_sharma on 18/06/16.
 * Built with Love
 */

import com.sun.javafx.beans.annotations.NonNull;
import factory.ComputerFactory;
import impl.BaseComputer;

import java.util.*;

/**
 * To perform same task with different parameters according to situation we can use Strategy design pattern
 * Note : This example uses SortingStrategyClass which in turn uses Comparator. The same task could also be done using comparator directly as a strategy
 **/
public class Question4 {

    public interface SortingStrategy<T> {
        List<T> sort(List<T> items);
    }

    private final List<BaseComputer> mComputersList;
    private SortingStrategy<BaseComputer> computerSortingStrategy;

    public Question4(@NonNull List<BaseComputer> mComputersList, @NonNull SortingStrategy<BaseComputer> strategy) {
        this.mComputersList = mComputersList;
        this.computerSortingStrategy = strategy;
    }

    public void setStrategy(@NonNull SortingStrategy<BaseComputer> strategy) {
        this.computerSortingStrategy = strategy;
    }

    public void sort() {
        computerSortingStrategy.sort(mComputersList);
    }

    private static class PowerSortingStrategy implements SortingStrategy<BaseComputer> {

        @Override
        public List<BaseComputer> sort(@NonNull List<BaseComputer> items) {
            Collections.sort(items, new Comparator<BaseComputer>() {
                @Override
                public int compare(BaseComputer o1, BaseComputer o2) {
                    int p1 = o1.powerConsumption(), p2 = o2.powerConsumption();
                    return p1 > p2 ? 1 : (p1 < p2 ? -1 : 0);
                }
            });
            return items;
        }
    }

    private static class PriceSortingStrategy implements SortingStrategy<BaseComputer> {

        @Override
        public List<BaseComputer> sort(@NonNull List<BaseComputer> items) {
            Collections.sort(items, new Comparator<BaseComputer>() {
                @Override
                public int compare(BaseComputer o1, BaseComputer o2) {
                    int p1 = o1.netPrice(), p2 = o2.netPrice();
                    return p1 > p2 ? 1 : (p1 < p2 ? -1 : 0);
                }
            });
            return items;
        }
    }

    public static void main(String[] args) {
        ComputerFactory factory = ComputerFactory.newFactory(ComputerFactory.ComputerType.DESKTOP);
        List<BaseComputer> computers = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            BaseComputer computer = factory.makeComputer();
            BaseComputer.Chassis chassis = (BaseComputer.Chassis) computer.getComponents().get(1);
            chassis.addComponent(new BaseComputer.Bus(new BaseComputer.NetworkCard(rand(r), rand(r)), rand(r), rand(r)));
            chassis.addComponent(new BaseComputer.MemoryUnit(rand(r), rand(r)));
            chassis.addComponent(new BaseComputer.CPU(rand(r), rand(r)));
            computers.add(computer);
        }

        Question4 q4 = new Question4(computers, new PowerSortingStrategy());
        q4.sort();

        print(computers);

        q4.setStrategy(new PriceSortingStrategy());
        q4.sort();

        System.out.print("\n\n");

        print(computers);
    }

    public static int rand(Random random) {
        return random.nextInt(11);
    }

    public static <T> void print(List<T> list) {
        for (T t : list) {
            System.out.println(t.toString());
        }
    }
}

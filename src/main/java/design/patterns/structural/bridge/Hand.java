package design.patterns.structural.bridge;

/**
 * 挎包
 */
public class Hand extends Bag {
    Hand(Color color) {
        super(color);
    }

    @Override
    public void getBag() {
        System.out.println(color.getColor() + "挎包");
    }
}

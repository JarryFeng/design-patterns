package design.patterns.structural.bridge;

/**
 * 钱包
 */
public class Wallet extends Bag {
    Wallet(Color color) {
        super(color);
    }

    @Override
    public void getBag() {
        System.out.println(color.getColor() + "钱包");
    }
}

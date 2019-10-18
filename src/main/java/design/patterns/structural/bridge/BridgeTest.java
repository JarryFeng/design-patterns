package design.patterns.structural.bridge;

/**
 * 桥接模式测试类
 */
public class BridgeTest {
    public static void main(String[] args) {

        //红色钱包
        Color color = new RedColor();
        Bag bag = new Wallet(color);
        bag.getBag();

        //黄色挎包
        Color color2 = new YellowColor();
        Bag bag2 = new Hand(color2);
        bag2.getBag();
    }
}

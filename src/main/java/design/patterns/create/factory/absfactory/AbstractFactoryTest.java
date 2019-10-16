package design.patterns.create.factory.absfactory;

/**
 * 抽象工厂测试类
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        System.out.println("小明想要联想笔记本和戴尔的鼠标");
        DellAbstractFactory dell = new DellAbstractFactory();
        dell.createMouse().move();

        LenovoAbstractFactory lenovo = new LenovoAbstractFactory();
        lenovo.createComputor().open();
    }
}

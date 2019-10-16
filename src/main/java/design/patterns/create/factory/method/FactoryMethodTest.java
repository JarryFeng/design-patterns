package design.patterns.create.factory.method;

import design.patterns.create.factory.Computor;

/**
 * 工厂方法测试类
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        DellFactory dellFactory = new DellFactory();
        Computor computor = dellFactory.create();
        computor.open();

        LenovoFactory lenovoFactory = new LenovoFactory();
        Computor computor2 = lenovoFactory.create();
        computor2.open();
    }
}

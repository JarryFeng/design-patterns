package design.patterns.factory.method;

import design.patterns.factory.Computor;

/**
 * 工厂方法测试类
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        DellFactory dellFactory = new DellFactory();
        Computor computor = dellFactory.create();
        computor.open();
    }
}

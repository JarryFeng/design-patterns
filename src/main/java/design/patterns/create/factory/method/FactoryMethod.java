package design.patterns.create.factory.method;

import design.patterns.create.factory.Computor;

/**
 * 工厂-工厂方法
 */
public interface FactoryMethod {
    //创建方法
    Computor create();
}

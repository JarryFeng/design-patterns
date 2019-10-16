package design.patterns.create.factory.absfactory;

import design.patterns.create.factory.Computor;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

    public abstract Mouse createMouse();

    public abstract Computor createComputor();

}

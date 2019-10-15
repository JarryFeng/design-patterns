package design.patterns.factory.absfactory;

import design.patterns.factory.Computor;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

    public abstract Mouse createMouse();

    public abstract Computor createComputor();

}

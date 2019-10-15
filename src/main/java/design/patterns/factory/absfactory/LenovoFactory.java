package design.patterns.factory.absfactory;

import design.patterns.factory.Computor;
import design.patterns.factory.LenovoComputor;
import design.patterns.factory.method.FactoryMethod;

/**
 * 工厂-联想工厂
 */
public class LenovoFactory implements FactoryMethod {
    @Override
    public Computor create() {
        return new LenovoComputor();
    }
}

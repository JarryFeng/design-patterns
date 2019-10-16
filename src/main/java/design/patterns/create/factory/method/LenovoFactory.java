package design.patterns.create.factory.method;

import design.patterns.create.factory.Computor;
import design.patterns.create.factory.LenovoComputor;

/**
 * 工厂-联想工厂
 */
public class LenovoFactory implements FactoryMethod {
    @Override
    public Computor create() {
        return new LenovoComputor();
    }
}

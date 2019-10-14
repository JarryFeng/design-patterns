package design.patterns.factory.method;

import design.patterns.factory.Computor;
import design.patterns.factory.DellComputor;
import design.patterns.factory.LenovoComputor;

/**
 * 联想工厂
 */
public class LenovoFactory implements FactoryMethod {
    @Override
    public Computor create() {
        return new LenovoComputor();
    }
}

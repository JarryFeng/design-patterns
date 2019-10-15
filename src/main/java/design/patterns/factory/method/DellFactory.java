package design.patterns.factory.method;

import design.patterns.factory.Computor;
import design.patterns.factory.DellComputor;

/**
 * 工厂-戴尔工厂
 */
public class DellFactory implements FactoryMethod {
    @Override
    public Computor create() {
        return new DellComputor();
    }
}

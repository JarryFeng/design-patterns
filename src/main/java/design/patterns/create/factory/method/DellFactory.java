package design.patterns.create.factory.method;

import design.patterns.create.factory.Computor;
import design.patterns.create.factory.DellComputor;

/**
 * 工厂-戴尔工厂
 */
public class DellFactory implements FactoryMethod {
    @Override
    public Computor create() {
        return new DellComputor();
    }
}

package design.patterns.create.factory.absfactory;

import design.patterns.create.factory.Computor;
import design.patterns.create.factory.DellComputor;

/**
 * 戴尔工厂
 */
public class DellAbstractFactory extends AbstractFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Computor createComputor() {
        return new DellComputor();
    }
}

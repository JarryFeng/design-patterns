package design.patterns.factory.absfactory;

import design.patterns.factory.Computor;
import design.patterns.factory.DellComputor;

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

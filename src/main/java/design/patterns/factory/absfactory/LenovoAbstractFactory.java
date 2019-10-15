package design.patterns.factory.absfactory;

import design.patterns.factory.Computor;
import design.patterns.factory.LenovoComputor;

/**
 * 工厂-联想工厂
 */
public class LenovoAbstractFactory extends AbstractFactory {
    @Override
    public Mouse createMouse() {
        return new LenovoMouse();
    }

    @Override
    public Computor createComputor() {
        return new LenovoComputor();
    }
}

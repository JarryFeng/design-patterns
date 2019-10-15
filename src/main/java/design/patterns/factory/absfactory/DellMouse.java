package design.patterns.factory.absfactory;

/**
 * 实际产品2-戴尔鼠标
 */
public class DellMouse implements Mouse {
    @Override
    public void move() {
        System.out.println("戴尔鼠标移动");
    }
}

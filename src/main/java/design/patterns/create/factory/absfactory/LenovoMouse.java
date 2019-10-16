package design.patterns.create.factory.absfactory;

/**
 * 实际产品2-联想鼠标
 */
public class LenovoMouse implements Mouse {
    @Override
    public void move() {
        System.out.println("联想鼠标移动");
    }
}

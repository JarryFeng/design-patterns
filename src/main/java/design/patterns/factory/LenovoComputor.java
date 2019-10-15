package design.patterns.factory;

/**
 * 实际产品-联想计算机
 */
public class LenovoComputor implements Computor {
    public void open() {
        System.out.println("联想电脑开机");
    }
}

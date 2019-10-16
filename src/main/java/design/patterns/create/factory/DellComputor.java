package design.patterns.create.factory;

/**
 * 实际产品-戴尔计算机
 */
public class DellComputor implements Computor{
    public void open() {
        System.out.println("戴尔电脑开机");
    }
}

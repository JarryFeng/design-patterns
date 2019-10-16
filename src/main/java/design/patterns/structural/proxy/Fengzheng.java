package design.patterns.structural.proxy;

/**
 * 被代理对象
 */
public class Fengzheng implements Person {

    @Override
    public void buyCar() {
        System.out.println("风筝买车");
    }

    public final void buyBike(){
        System.out.println("买自行车");
    }
}

package design.patterns.structural.proxy.staticproxy;

import design.patterns.structural.proxy.Person;

/**
 * 静态代理对象
 */
public class StaticProxy implements Person {

    //持有被代理对象的引用
    private Person target;

    public StaticProxy(Person target){
        this.target = target;
    }

    @Override
    public void buyCar() {
        System.out.println("代理对象帮我向车厂下订单");
        target.buyCar();
        System.out.println("代理对象帮我向车厂提货");
    }
}

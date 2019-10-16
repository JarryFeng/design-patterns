package design.patterns.structural.proxy.staticproxy;

import design.patterns.structural.proxy.Fengzheng;
import design.patterns.structural.proxy.Person;

/**
 * 静态代理测试类
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Person person = new Fengzheng();
        StaticProxy staticProxy = new StaticProxy(person);
        staticProxy.buyCar();
    }
}

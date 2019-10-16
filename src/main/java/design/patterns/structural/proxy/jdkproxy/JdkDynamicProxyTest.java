package design.patterns.structural.proxy.jdkproxy;

import design.patterns.structural.proxy.Fengzheng;
import design.patterns.structural.proxy.Person;

/**
 * JDK动态代理测试类
 */
public class JdkDynamicProxyTest {
    public static void main(String[] args) {
        Person person = new Fengzheng();

        JdkInvocationHandler handler = new JdkInvocationHandler();
        Person proxy = handler.getProxy(person);
        proxy.buyCar();
    }
}

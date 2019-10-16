package design.patterns.structural.proxy.cglibproxy;

import design.patterns.structural.proxy.Fengzheng;
import design.patterns.structural.proxy.Person;

/**
 * Cglib动态代理测试类
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        Fengzheng fz = new Fengzheng();
        //获取代理对象
        Fengzheng proxy = (Fengzheng)CglibProxy.getInstance(fz);

        proxy.buyCar();
    }
}

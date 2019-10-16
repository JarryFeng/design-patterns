package design.patterns.structural.proxy.jdkproxy;

import design.patterns.structural.proxy.Person;
import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * JDK动态代理,被代理对象必须实现接口
 */
public class JdkInvocationHandler implements InvocationHandler {

    private Person target;

    public Person getProxy(Person target){
        this.target = target;
        return (Person) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        System.out.println("JDK动态代理向车厂下订单");
        method.invoke(target, objects);
        System.out.println("JDK动态代理向车厂");

        return null;
    }
}

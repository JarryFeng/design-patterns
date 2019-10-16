package design.patterns.structural.proxy.cglibproxy;

import design.patterns.structural.proxy.Fengzheng;
import design.patterns.structural.proxy.Person;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib动态代理-基于继承实现的代理
 */
public class CglibProxy implements MethodInterceptor {

    private Fengzheng target;

    private CglibProxy(Fengzheng target){
        this.target = target;
    }

    public static Object getInstance(Fengzheng target){

        Enhancer enhancer = new Enhancer();
        //设置父类-即设置需要被代理的对象
        enhancer.setSuperclass(target.getClass());
        //设置回调对象
        enhancer.setCallback(new CglibProxy(target));
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("Cglib动态代理-联系车厂下单");
        Object obj = method.invoke(target, objects);
        System.out.println("Cglib动态代理-联系车厂提货");

        return obj;
    }
}

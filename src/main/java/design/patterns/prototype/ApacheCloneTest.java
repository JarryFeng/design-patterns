package design.patterns.prototype;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * apache之 commons-beanutils
 * 1. 浅拷贝
 * 2. 不需要实现cloneable接口
 * 3. 使用setXXX方法名一致进行设值，不同类型会先进行类型转换，
 */
public class ApacheCloneTest {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Person instance = PrototypeFactory.getInstance();

        Person clone = (Person)BeanUtils.cloneBean(instance);//底层调用copyProperties方法

        System.out.println(clone.getAddress() == instance.getAddress());//true

        Person p = new Person();
        BeanUtils.copyProperties(p, instance);

        System.out.println(instance.getAddress() == p.getAddress());//true
        System.out.println(instance.getName() == p.getName());//true


        //属性名相同既可以复制
        User user = new User();
        BeanUtils.copyProperties(user, instance);
        System.out.println(user.getName());//0 String无法转成Integer时，输出默认值
        System.out.println(user.getAge());//10
        //System.out.println(user.getAddress() == instance.getAddress()); //true

    }
}

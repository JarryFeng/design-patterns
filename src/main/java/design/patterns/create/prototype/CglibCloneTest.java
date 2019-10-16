package design.patterns.create.prototype;

import net.sf.cglib.beans.BeanCopier;
import net.sf.cglib.core.Converter;

/**
 * Cglib 浅拷贝
 * 名称相同而类型不同的属性不会被拷贝
 */
public class CglibCloneTest {
    public static void main(String[] args) {
        Person instance = PrototypeFactory.getInstance();

        //未使用自定义转换器
        BeanCopier beanCopier = BeanCopier.create(Person.class, Person.class, false);

        Person person = new Person();
        beanCopier.copy(instance, person, null);

        System.out.println(instance.getAddress() == person.getAddress());//true
        System.out.println(instance.getName() == person.getName());//true


        BeanCopier beanCopier2 = BeanCopier.create(Person.class, User.class, false);
        User user = new User();
        beanCopier2.copy(instance, user, null);

        System.out.println(user.getName());//null
        System.out.println(user.getAge());//null 类型不同不能复制
        //System.out.println(instance.getAddress() == user.getAddress());//true


        System.out.println("=======================深拷贝？============================");
        //自定义转换器
        Person pp = new Person();
        BeanCopier beanCopier3 = BeanCopier.create(Person.class, Person.class, true);
        beanCopier3.copy(instance, pp, new Converter(){
            @Override
            public Object convert(Object value, Class target, Object context) {

                if(target == Address.class){
                    BeanCopier.create(target, target, true).copy(value, value, this);
                }
                return value;
            }
        });

        System.out.println(instance.getName() == pp.getName());//true
        System.out.println(instance.getAddress() == pp.getAddress());//true

        //纳尼，为什么不是深拷贝呢？

    }
}

package design.patterns.create.prototype;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * orika深度拷贝
 */
public class OrikaCloneTest {
    public static void main(String[] args) {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        mapperFactory.classMap(Person.class, Person.class)
                .byDefault()
                .register();
        ConverterFactory converterFactory = mapperFactory.getConverterFactory();
        MapperFacade mapper = mapperFactory.getMapperFacade();

        Person p1 = PrototypeFactory.getInstance();
        Person p2 = mapper.map(p1, Person.class);

        System.out.println(p1.getName() == p2.getName()); //true
        System.out.println(p1.getAddress() == p2.getAddress()); //false
    }
}

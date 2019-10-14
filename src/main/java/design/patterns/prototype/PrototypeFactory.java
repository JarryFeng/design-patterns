package design.patterns.prototype;

/**
 * 原型工厂
 */
public class PrototypeFactory {
    public static Person getInstance(){
        Person person = new Person();
        person.setAge(10);
        person.setName("fengzheng");

        Address address = new Address();
        address.setDetail("世外桃源");
        address.setDoorNumber("888");
        person.setAddress(address);

        return person;
    }
}

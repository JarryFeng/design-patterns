package design.patterns.prototype;

/**
 * 原型模式-用户对象
 */
public class Person implements Cloneable{
    private String name;
    private Integer age;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        Person person = (Person) clone;
        Address address = (Address)person.getAddress().clone();
        person.setAddress(address);
        return person;
    }
}

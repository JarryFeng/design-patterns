package design.patterns.prototype;

/**
 * 原型模式-用户对象
 */
public class User implements Cloneable{
    private Integer name;
    private String age;
    private Address address;

    public Integer getName() {
        return name;
    }

    public void setName(String name){
        this.name = Integer.valueOf(name);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
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
        User person = (User) clone;
        Address address = (Address)person.getAddress().clone();
        person.setAddress(address);
        return person;
    }
}

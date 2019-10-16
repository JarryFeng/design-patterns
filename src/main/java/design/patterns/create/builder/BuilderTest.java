package design.patterns.create.builder;

/**
 * 建造者模式
 */
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();

        Director director = new Director(builder);

        House composite = director.composite();

        System.out.println(composite);
    }
}

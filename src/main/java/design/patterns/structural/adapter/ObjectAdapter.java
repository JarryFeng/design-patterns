package design.patterns.structural.adapter;

/**
 * 对象适配器，即适配者组合在适配器中
 */
public class ObjectAdapter implements ObjectLog{
    private ObjectAdaptee objectAdaptee = new ObjectAdaptee();

    @Override
    public void log() {
        objectAdaptee.doSomething();
    }

    public static void main(String[] args) {
        ObjectLog log = new ObjectAdapter();
        log.log();
    }
}

/**
 * 对象适配者
 */
class ObjectAdaptee {
    public void doSomething(){
        System.out.println("对象适配者");
    }
}

interface ObjectLog{
    void log();
}
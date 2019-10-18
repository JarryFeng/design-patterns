package design.patterns.structural.adapter;

/**
 * 类适配器
 */
public class ClassAdapter extends Adaptee implements Log{

    @Override
    public void recordLog(String s) {
        //调用适配者进行记录日志
        super.error(s);
    }

    public static void main(String[] args) {
        Log log = new ClassAdapter();
        log.recordLog("类适配器");
    }
}

interface Log {
    void recordLog(String s);
}

/**
 * 适配者
 */
class Adaptee {
    public void error(String s){
        System.out.println("适配者记录错误日志：" + s);
    }
}
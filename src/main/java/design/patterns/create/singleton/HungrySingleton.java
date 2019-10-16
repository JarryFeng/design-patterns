package design.patterns.create.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 单例模式-饿汉式
 */
public class HungrySingleton implements Serializable {

    private final static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return instance;
    }

    /**
     * 解决JDK反序列化会重新创建对象的问题，保证对象的单例
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

}

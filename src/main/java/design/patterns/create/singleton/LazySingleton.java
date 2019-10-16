package design.patterns.create.singleton;

/**
 * 单例模式-懒汉式
 * volatile关键字： 1. 可见性 2. 禁止进行指令重排
 */
public class LazySingleton {
    private static LazySingleton instance1;
    private static LazySingleton instance2;
    private volatile static LazySingleton instance3;

    private LazySingleton(){}

    /**
     * 线程不安全
     * @return
     */
    public synchronized static LazySingleton getInstance1(){
        if(instance1 == null){
            instance1 = new LazySingleton();
        }
        return instance1;
    }

    /**
     * 线程安全，但是每次都要进行同步，造成不必要的开销
     * @return
     */
    public synchronized static LazySingleton getInstance2(){
        if(instance2 == null){
            instance2 = new LazySingleton();
        }
        return instance2;
    }

    /**
     * 双重检查锁DCL,线程安全，第一次是为了不必要的同步，
     * 但是在高并发的情况下，大量线程依然会为了争夺synchronized锁而进行阻塞
     * @return
     */
    public static LazySingleton getInstance3(){
        if(instance3 == null){
            synchronized (LazySingleton.class){
                if(instance3 == null){
                    instance3 = new LazySingleton();
                }
            }
        }
        return instance3;
    }

}

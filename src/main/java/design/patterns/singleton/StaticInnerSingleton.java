package design.patterns.singleton;

/**
 * 单例模式-静态内部类
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton(){

    }

    public static StaticInnerSingleton getInstance(){
        return SingletonHolder.instance;
    }

    /**
     * 只有当SingletonHolder被调用时，才进行加载并初始化instance，避免造成资源浪费
     */
    private static class SingletonHolder{
        private static final StaticInnerSingleton instance = new StaticInnerSingleton();
    }
}

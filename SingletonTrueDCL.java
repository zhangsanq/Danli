package cn.springmvc.Danli;
/**
 * DCL:双重检测锁(Double Checked Lock)
 * 优点:线程安全,延迟加载效率高
 * 缺点:由于volatile关键字会屏蔽JVM所做的一些代码略微的性能降低但除非你的代码在并发场景或者低于JDK1.6版本下使用
 * 一般是可以满足需求的
 */
public class SingletonTrueDCL {
    SingletonTrueDCL() {

    }
    private static volatile SingletonTrueDCL instance;
    public static SingletonTrueDCL getInstance() {
        if (instance == null) {
            synchronized (SingletonTrueDCL.class) {
                if (instance == null) {
                    instance = new SingletonTrueDCL();
                }
            }
        }
        return instance;
    }

}

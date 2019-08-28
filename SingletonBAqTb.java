package cn.springmvc.Danli;

/**
 * @ClassName SingletonBAqTb
 * @Description TODO
 * @Author Forlevin
 * @Date 2019/7/15 13:18
 * @Version 1.0
 **/
public class SingletonBAqTb {
    /**
     * 线程安全存在同步开销的问题
     * 优点:懒加载,只有在使用的时候才会加载,获取单例方法加了同步锁保证了线程的安全
     * 缺点:效率低,每个线程在想获取类的实例时,执行getInstance方法时都要进行同步
     */
    private static SingletonBAqTb instance;
    private SingletonBAqTb(){

    }
    public static synchronized SingletonBAqTb getInstance(){
        if(instance==null){
            instance=new SingletonBAqTb();
        }
        return instance;
    }
}

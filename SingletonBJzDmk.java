package cn.springmvc.Danli;

/**
 * @ClassName SingletonBJzDmk
 * @Description TODO
 * @Author Forlevin
 * @Date 2019/7/15 13:22
 * @Version 1.0
 **/
public class SingletonBJzDmk {
    /**
     * 线程假装安全,同步代码块
     * 优点:改良了每个线程在想获取类的实例的时候都要同步加载getInstance()方法都要进行同步
     * 缺点:这个方法同样不能保证线程的安全问题,只要两个线程同时进入了instace==null这个判断的时候照样会做两次new操作
     */
    private static SingletonBJzDmk instance;
    private SingletonBJzDmk(){

    }
    public static SingletonBJzDmk getInstance(){
        if(instance==null){
            synchronized (SingletonBJzDmk.class){
                instance=new SingletonBJzDmk();
            }
        }
        return instance;
    }
}

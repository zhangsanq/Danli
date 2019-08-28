package cn.springmvc.Danli;

/**
 * @ClassName SingletonBNoAq
 * @Description TODO
 * @Author Forlevin
 * @Date 2019/7/15 13:11
 * @Version 1.0
 **/
public class SingletonBNoAq {
    /**
     * 线程不安全
     * 优点:只有在需要的时候才会加载
     * 缺点:只能在单线程下使用如果在多线程下instance对象还是null这个时候两个线程同时访问getInstance()方法因为对象还是null
     *  所以两个线程同时通过了判断同时去new了对象 所以在多线程的情况下是不可以使用的
     */
    private static SingletonBNoAq instance;
    private SingletonBNoAq(){

    }
    public static SingletonBNoAq getInstance(){
        if(instance==null){
            instance=new SingletonBNoAq();
        }
        return instance;
    }
}

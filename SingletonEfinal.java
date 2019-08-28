package cn.springmvc.Danli;

/**
 * @ClassName SingletonEfinal
 * @Description TODO
 * @Author Forlevin
 * @Date 2019/7/15 13:07
 * @Version 1.0
 **/
public class SingletonEfinal {
    //常量类

    /**
     * 优点:写法比较简单,在类装载的时候就完成实例化避免了线程同步的问题
     * 缺点:在类装载的时候就完成了实例化,没有达到LazyLoading的效果如果从未使用过该对象就会造成资源的浪费
     */
    private SingletonEfinal(){

    }
    private final static SingletonEfinal INSTANCE=new SingletonEfinal();
    public static SingletonEfinal getInstance(){
        return INSTANCE;
    }
}

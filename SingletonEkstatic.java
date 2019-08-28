package cn.springmvc.Danli;

/**
 * @ClassName SingletonEkstatic
 * @Description TODO
 * @Author Forlevin
 * @Date 2019/7/15 13:08
 * @Version 1.0
 **/
public class SingletonEkstatic {
    //静态代码块
    private static SingletonEkstatic instance;
    static{
        instance=new SingletonEkstatic();
    }
    private SingletonEkstatic(){

    }
    public static SingletonEkstatic getInstance(){
        return instance;
    }
}

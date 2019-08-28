package cn.springmvc.Danli;

/**
 * @ClassName SingletonEstatic
 * @Description TODO
 * @Author Forlevin
 * @Date 2019/7/15 13:04
 * @Version 1.0
 **/
public class SingletonEstatic {
    //饿汉模式静态变量
    private SingletonEstatic(){

    }
    private static SingletonEstatic instance=new SingletonEstatic();
    public static SingletonEstatic getInstance(){
        return instance;
    }

}

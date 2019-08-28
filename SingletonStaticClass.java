package cn.springmvc.Danli;

/**
 * @ClassName SingletonStaticClass
 * @Description TODO
 * @Author Forlevin
 * @Date 2019/7/15 13:51
 * @Version 1.0
 **/
public class SingletonStaticClass {
    /**
     * 静态内部类
     * 优点:避免了线程不安全,延迟加载,效率高
     * 缺点:依旧不能解决在反序列化,反射,克隆时重新生成实例对象的问题
     */
    private SingletonStaticClass(){

    }
    private static class SingletionInstance{
        private static final SingletonStaticClass INSTANCE=new SingletonStaticClass();
    }
    public static SingletonStaticClass getInstance(){
        return SingletionInstance.INSTANCE;
    }
}

package cn.springmvc.Danli;

/**
 * @ClassName SingletonTDCL
 * @Description TODO
 * @Author Forlevin
 * @Date 2019/7/15 13:33
 * @Version 1.0
 **/
public class SingletonTDCL {
    /**
     * 该代码做的三件事情:
     *      1.给SingletionTDCL实例分配内存
     *      2.调用Singletion()的构造函数初始化成员字段
     *      3.将instance对象指向分配内存的空间(此时的instance就不在是null了)
     *
     *    优点:线程安全,延迟加载效率高
     *    缺点:JVM编译器的指令重排导致单例出现漏洞(可能会导致DCL失效的问题)
     */
    private static SingletonTDCL instance=null;
    private SingletonTDCL(){

    }
    public static SingletonTDCL getInstance(){
        if(instance==null){
            synchronized (SingletonTDCL.class){
                if (instance==null){
                    instance=new SingletonTDCL();
                }
            }
        }
        return instance;
    }
}

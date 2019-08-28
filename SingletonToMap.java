package cn.springmvc.Danli;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName SingletonToMap
 * @Description TODO
 * @Author Forlevin
 * @Date 2019/7/15 14:27
 * @Version 1.0
 **/
public class SingletonToMap {
    /**
     * 使用Map容器来管理单例模式
     *  优点:在程序的初始,将多种单例类型注入到一个统一的管理类中,在使用时根据key获取对应类型的对象这种方式使得我们可以管理多种
     *      类型的单例,并且在使用时可以通过统一的接口进行获取操作,降低了用户的使用成本也对用户隐藏了具体的实现,降低了耦合度
     *  缺点:不常用,有些麻烦
     *  单例模式的优点；
     *      1.单例模式的优点其实已经在定义中体现了:可以减少系统内存开支,减少系统性能开销,避免了对资源的多重占用,同时操作
     *  单例的模式的缺点:
     *      1.违反了单一责任链原则,测试困难单例类的职责过重,在一定程度上违背了"单一职责原则"因为单例类即充当了工厂类角色
     *          提供了工厂方法同时又充当了产品角色,包含了一些业务方法,将产品的创建和产品的本身的功能融合到了一起
     *      2.扩展困难由于单例模式中没有抽象层,因此单例类的扩展有很大的困难,修改功能必须要去修改源码
     *      3.共享资源有可能不一致现在很多面向对象语言如(JAVA,C++)的环境都提供了自动垃圾回收的技术因此,如果实例化的共享对象
     *          长时间不被利用,系统就会认为它是垃圾,会自动销毁并回收资源,下次利用时又将重新实例化这将导致共享的单例对象状态
     *          的丢失
     *
     *
     *
     *
     *
     *
     *
     */
    private SingletonToMap(){

    }
    private static Map<String,Object> objectMap=new HashMap<String,Object>();
    public static void registerService(String key,Object instance){
        if(!objectMap.containsKey(key)){
            objectMap.put(key,instance);
        }
    }
    public static Object getService(String key){
        return objectMap.get(key);
    }
}

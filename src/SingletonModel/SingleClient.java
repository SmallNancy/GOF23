package SingletonModel;

import java.lang.reflect.Constructor;

/**
 * @Author: Nancy
 * @Date: 2019/3/25 10:33
 * 通过反射和反序列化都破坏单例
 * 通过实现readResolve方法可以防止序列化和反序列化破坏单例
 */
public class SingleClient {
    public static void main(String[] args) throws Exception{
        Singleton3 demo = Singleton3.getInstance();
        Singleton3 demo2 = Singleton3.getInstance();
        System.out.println(demo);
        System.out.println(demo2);
        System.out.println(demo == demo2);

        /**
         * 通过反射破坏单例
         */
        Class<Singleton3> clazz = (Class<Singleton3>)Class.forName("SingletonModel.Singleton3");
        Constructor<Singleton3> c = clazz.getDeclaredConstructor(null);           //调用无参构造器
        c.setAccessible(true);               // 设置可修改
        Singleton3 s3 = c.newInstance();
        Singleton3 s4 = c.newInstance();
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s3 == s4);         //结果为false

    }
}

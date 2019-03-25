/**
 * @Author: Nancy
 * @Date: 2019/3/25 10:17
 * 静态内部类实现单例模式
 */
public class Singleton3 {
    private static class SingleClassInstance{
       private static final Singleton3 instance = new Singleton3();  //线程安全
    }
    private Singleton3(){

    }
    public static Singleton3 getInstance(){
        return SingleClassInstance.instance;   //懒加载
    }
}

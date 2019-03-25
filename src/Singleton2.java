/**
 * @Author: Nancy
 * @Date: 2019/3/25 10:10
 *懒汉式单例模式：调用效率不高，延时加载。
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){
        if (instance != null){
            throw new RuntimeException();  // 防止反射破坏单例
        }

    }
    public  static synchronized Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}

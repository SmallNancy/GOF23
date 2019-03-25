/**
 * @Author: Nancy
 * @Date: 2019/3/25 9:55
 * 单例模式：保证一个类只有一个单例，优化共享资源访问。
 * 单例模式的破解：一般可以通过反射，破解单例
 *   都是线程安全的
 * 应用场景：
 * 1、Windows中任务管理器功能
 * 2、网站的计数器
 * 3、项目中配置文件的读取
 * 4、数据库连接池
 *
 */
public class Singleton {
    /**
     * 饿汉式：初始化时立即加载这个类，生成单例
     * 调用效率高，不能延时加载
     */
    private static Singleton instance = new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return instance;
    }
}

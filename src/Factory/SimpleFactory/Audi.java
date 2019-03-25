package Factory.SimpleFactory;

/**
 * @Author: Nancy
 * @Date: 2019/3/25 15:47
 */
public class Audi implements Car {
    @Override
    public void run() {
        System.out.println("奥迪在跑");
    }
}

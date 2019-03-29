package bridge;

/**
 * @Author: Nancy
 * @Date: 2019/3/29 9:28
 * 桥接模式
 */
public class Client {
    public static void main(String[] args) {
        Computer c = new DeskTop(new Dell());
        c.sale();
    }
}

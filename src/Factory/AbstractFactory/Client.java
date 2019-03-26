package Factory.AbstractFactory;

/**
 * @Author: Nancy
 * @Date: 2019/3/26 15:11
 *
 * 抽象工厂模式
 */
public class Client {
    public static void main(String[] args) {
        ComputerFactory fac = new LuxcyComputerFac();
        fac.createCpu().run();
        fac.createKeyBoard().keyInput();
    }
}

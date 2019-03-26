package Factory.AbstractFactory;

/**
 * @Author: Nancy
 * @Date: 2019/3/26 15:07
 */
public interface ComputerFactory {
    KeyBoard createKeyBoard();
    Cpu createCpu();
    Mouse createMouse();
}

package Factory.AbstractFactory;

/**
 * @Author: Nancy
 * @Date: 2019/3/26 15:09
 */
public class LowComputerFac implements ComputerFactory {
    @Override
    public KeyBoard createKeyBoard() {
        return new LowKeyBoad();
    }

    @Override
    public Cpu createCpu() {
        return new LowCpu();
    }

    @Override
    public Mouse createMouse() {
        return new LowMouse();
    }
}

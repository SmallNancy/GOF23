package Factory.AbstractFactory;

/**
 * @Author: Nancy
 * @Date: 2019/3/26 15:09
 */
public class LuxcyComputerFac implements ComputerFactory {
    @Override
    public KeyBoard createKeyBoard() {
        return new LuxcyKeyBoad();
    }

    @Override
    public Cpu createCpu() {
        return new LuxuryCpu();
    }

    @Override
    public Mouse createMouse() {
        return new LowMouse();
    }
}

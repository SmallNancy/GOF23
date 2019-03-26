package Factory.AbstractFactory;

/**
 * @Author: Nancy
 * @Date: 2019/3/26 15:03
 */
public interface KeyBoard {
    void keyInput();
}

class LuxcyKeyBoad implements KeyBoard{
    @Override
    public void keyInput() {
        System.out.println("键盘使用手感好，舒服");
    }
}

class LowKeyBoad implements KeyBoard{
    @Override
    public void keyInput() {
        System.out.println("键盘使用手感差，不舒服");
    }
}

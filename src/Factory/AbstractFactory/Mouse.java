package Factory.AbstractFactory;

/**
 * @Author: Nancy
 * @Date: 2019/3/26 15:00
 */
public interface Mouse {
    void move();
}

class LuxcyMouse implements Mouse{
    @Override
    public void move() {
        System.out.println("鼠标磨损慢，使用时间久，响应速度可以调节");
    }
}

class LowMouse implements Mouse{
    @Override
    public void move() {
        System.out.println("鼠标磨损快，使用时间短，响应速度差");
    }
}
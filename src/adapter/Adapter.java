package adapter;

/**
 * @Author: Nancy
 * @Date: 2019/3/28 15:45
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void dealRequest() {
        super.request();

    }
}

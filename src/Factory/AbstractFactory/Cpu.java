package Factory.AbstractFactory;

/**
 * @Author: Nancy
 * @Date: 2019/3/26 14:52
 */
public interface Cpu {
    void run();
    void time();
}

class LuxuryCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("Cpu 跑的快，散热快，转速高，不卡");
    }

    @Override
    public void time() {
        System.out.println("时间响应速度比较快");

    }
}

class LowCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("Cpu 跑的慢，散热慢，转速低，卡");
    }

    @Override
    public void time() {
        System.out.println("时间响应速度比较慢");

    }
}

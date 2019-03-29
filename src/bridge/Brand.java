package bridge;

/**
 * @Author: Nancy
 * @Date: 2019/3/29 9:21
 */
public interface Brand {
    void sale();
}

class Dell implements Brand{
    @Override
    public void sale() {
        System.out.println("品牌dell");
    }
}

class Leveon implements Brand{
    @Override
    public void sale() {
        System.out.println("品牌Leveon");
    }
}

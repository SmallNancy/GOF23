package bridge;


/**
 * @Author: Nancy
 * @Date: 2019/3/29 9:23
 */
public class Computer {
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }
    public void sale(){
        brand.sale();;
    }
}

class DeskTop extends Computer{
    public DeskTop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售类型台式机");
    }
}

class Laptop extends Computer{
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售类型台式机");
    }
}

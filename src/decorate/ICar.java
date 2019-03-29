package decorate;

/**
 * @Author: Nancy
 * @Date: 2019/3/29 10:33
 */
public interface ICar {     // 抽象接口
    void move();
}
class Car implements ICar{  // 真实对象
    @Override
    public void move() {
        System.out.println("正常地上跑");
    }
}

class SuperCar implements ICar{   //装饰角色
    protected ICar car;
    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

class AddFly extends SuperCar{   // 装饰角色
    public AddFly(ICar car) {
        super(car);
    }
    public void fly(){
        System.out.println("增加了飞行的功能");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

class AddWater extends SuperCar{
    public AddWater(ICar car) {
        super(car);
    }
    public void swim(){
        System.out.println("增加了防水的功能");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}
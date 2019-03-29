package decorate;

/**
 * @Author: Nancy
 * @Date: 2019/3/29 10:41
 * 装饰器模式动态的为对象增加新的功能
 * 抽象接口、真实角色，装饰角色
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        AddFly flyCar = new AddFly(car);
        flyCar.move();
        System.out.println("---------------------");
        AddWater newCar = new AddWater(flyCar);
        newCar.move();
    }
}

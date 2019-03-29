package decorate;

/**
 * @Author: Nancy
 * @Date: 2019/3/29 10:41
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

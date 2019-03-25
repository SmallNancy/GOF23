package Factory.FactoryMethond;

import Factory.SimpleFactory.Car;

/**
 * @Author: Nancy
 * @Date: 2019/3/25 16:05
 *
 * 工厂方法模式，符合开闭原则
 * 每一个具体类对应一个工厂类
 * 但是类的数量会增多
 */
public class Client {
    public static void main(String[] args) {
        Car audi = new AudiFactory().creatCar();
        Car byd = new BydFactory().creatCar();
        audi.run();
        byd.run();

    }
}

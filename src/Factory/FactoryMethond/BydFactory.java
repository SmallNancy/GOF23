package Factory.FactoryMethond;

import Factory.SimpleFactory.Byd;
import Factory.SimpleFactory.Car;

/**
 * @Author: Nancy
 * @Date: 2019/3/25 16:05
 */
public class BydFactory implements CarFactory {
    @Override
    public Car creatCar() {
        return new Byd();
    }
}

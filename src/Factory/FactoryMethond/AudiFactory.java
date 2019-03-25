package Factory.FactoryMethond;

import Factory.SimpleFactory.Audi;
import Factory.SimpleFactory.Car;

/**
 * @Author: Nancy
 * @Date: 2019/3/25 16:04
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car creatCar() {
        return new Audi();
    }
}

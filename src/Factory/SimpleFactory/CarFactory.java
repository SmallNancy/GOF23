package Factory.SimpleFactory;

/**
 * @Author: Nancy
 * @Date: 2019/3/25 15:48
 */
public class CarFactory {
    public static Car createCar(String type){
        if ("奥迪".equals(type)){
            return new Audi();
        }else if ("比亚迪".equals(type)){
            return new Byd();
        }else {
            return null;
        }
    }
}

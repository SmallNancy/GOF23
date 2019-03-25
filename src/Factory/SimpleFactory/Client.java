package Factory.SimpleFactory;

/**
 * @Author: Nancy
 * @Date: 2019/3/25 15:50
 * 简单工厂模式（静态工厂模式）：实现创建者与调用者的分离、简单、使用比较多
 * 违反开闭原则
 */
public class Client {
    public static void main(String[] args) {
        Car audi = CarFactory.createCar("奥迪");
        audi.run();
    }
}

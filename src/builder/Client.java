package builder;

/**
 * @Author: Nancy
 * @Date: 2019/3/27 16:16
 *
 * 建造者模式：实现创建者和组装这分离，一般和工厂模式一起用
 */
public class Client {
    public static void main(String[] args) {
        NancyAirshipDirector nancy = new NancyAirshipDirector(new MyAirshipBuilder());
        Airship aa = nancy.directAirship();
        System.out.println(aa.getEngine());
    }
}

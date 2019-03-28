package adapter;

/**
 * @Author: Nancy
 * @Date: 2019/3/28 15:45
 */
public class Adapter2  implements Target {
    Adaptee ad = new Adaptee();

    public Adapter2(Adaptee ad) {
        this.ad = ad;
    }

    @Override
    public void dealRequest() {
       ad.request();

    }
}

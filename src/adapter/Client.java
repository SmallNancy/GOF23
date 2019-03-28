package adapter;

/**
 * @Author: Nancy
 * @Date: 2019/3/28 15:41
 *
 * 适配器模型  ：target 接口，适配器，被适配者，
 */
public class Client {
    public static void main(String[] args) {
        Client c = new Client();
        Target adapter = new Adapter();
//        adapter.dealRequest();      // 类适配器

        Adaptee ae = new Adaptee();
        Target ad = new Adapter2(ae);
        ad.dealRequest();             // 对象适配器

    }
}

package prototype;

import java.util.Date;

/**
 * @Author: Nancy
 * @Date: 2019/3/27 20:25
 * 原型模式 实现 Cloneable 接口，重写clone方法
 * 浅复制：s1变，s2也变，都指向同一个对象
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(2546656545L);
        Sheep s1 = new Sheep("母羊",date);
        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s1);
        System.out.println(s1.getName() + " " + s1.getDate());
        s1.setDate(new Date(451254545L));
        System.out.println(s1.getName() + " " + s1.getDate());



        System.out.println(s2);
        System.out.println(s2.getName() + " " + s2.getDate());
    }
}

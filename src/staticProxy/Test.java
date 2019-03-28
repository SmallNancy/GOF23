package staticProxy;

/**
 * @Author: Nancy
 * @Date: 2019/3/28 16:18
 * 静态代理模式
 */
public class Test {
    public static void main(String[] args) {
        Father father = new Father();
        Nurse nurse = new Nurse(father);
        nurse.CareChildren();
        nurse.FixTools();
    }
}

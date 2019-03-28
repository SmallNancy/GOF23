package staticProxy;

/**
 * @Author: Nancy
 * @Date: 2019/3/28 16:13
 */
public class Father implements Person {
    @Override
    public void FixTools() {
        System.out.println("爸爸修理家具、电器");
    }

    @Override
    public void CareChildren() {
        System.out.println("爸爸照顾");
    }
}

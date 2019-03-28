package staticProxy;

/**
 * @Author: Nancy
 * @Date: 2019/3/28 16:16
 *
 * 代理类，替主人照顾小孩
 */
public class Nurse implements Person {
    Father father;

    public Nurse(Father father) {
        this.father = father;
    }

    @Override
    public void FixTools() {
        father.FixTools();
    }

    @Override
    public void CareChildren() {
        System.out.println("护士帮助照顾小孩。");

    }
}

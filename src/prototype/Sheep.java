package prototype;

import java.util.Date;

/**
 * @Author: Nancy
 * @Date: 2019/3/27 20:16
 *
 * 继承Cloneable接口，重写clone方法。
 */
public class Sheep implements Cloneable {
    private String name;
    private Date date;

    public Sheep() {
    }

    public Sheep(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

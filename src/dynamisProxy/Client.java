package dynamisProxy;

import staticProxy.Father;
import staticProxy.Nurse;
import staticProxy.Person;

import java.lang.reflect.Proxy;

/**
 * @Author: Nancy
 * @Date: 2019/3/28 16:38
 * 动态代理
 */
public class Client {
    public static void main(String[] args) {
        Father father = new Father();
        Person p = new Nurse(father);
        StartHandle handle = new StartHandle(p);
        Person proxy = (Person) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Person.class},handle);
        proxy.FixTools();
        proxy.CareChildren();
    }
}

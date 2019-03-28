package dynamisProxy;

import staticProxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Nancy
 * @Date: 2019/3/28 16:36
 */
public class StartHandle implements InvocationHandler {
    Person person;

    public StartHandle(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(person,args);
        return null;
    }
}

package dynamicproxydemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Shen_potato on 2018/11/25.
 */
public class StudentInvocationHandle<T> implements InvocationHandler {
    //InvocationHandler持有的被代理对象
    T target;

    public StudentInvocationHandle(T target) {
        this.target = target;
    }

    /*
    * proxy表示动态代理的对象
    * method：表示正在执行的方法
    * args：表示调用目标方法时传入的实参
    * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行"+method.getName()+"方法");
        //代理过程中插入监测方法，计算该方法耗时
        MonitorUnit.start();
        Object result = method.invoke(target,args);
        MonitorUnit.finish(method.getName());
        return result;
    }
}

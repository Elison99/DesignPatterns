package org.example.design.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 1、使用cglib帮我们创建出代理对象
 */
public class CglibProxy {
    //为任意对象创建代理
    public static<T> T createProxy(T t){
        //1、创建一个增强器
        Enhancer enhancer = new Enhancer();

        //2、设置要增强哪个个类的功能。增强器为这个类动态创建一个子类
        enhancer.setSuperclass(t.getClass());

        //3、设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o,
                                    Method method, //为了能获取到原方法的一些元数据信
                                    Object[] objects,
                                    MethodProxy methodProxy) throws Throwable {
                //编写拦截的逻辑
                System.out.println("cglib上场le .......xxx");
                System.out.println(method.getClass());
                System.out.println(method.getDeclaredAnnotations());
                //目标方法进行执行
                Object invoke = methodProxy.invokeSuper(o,objects);
                return invoke;
            }
        });

        Object o = enhancer.create();
        return (T) o;
    }
}

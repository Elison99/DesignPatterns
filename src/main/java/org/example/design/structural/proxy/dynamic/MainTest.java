package org.example.design.structural.proxy.dynamic;


import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 动态代理模式：
 * JDK要求被代理对象必须有接口
 *
 * 代理对象和目标对象的相同点在于都是同一个接口
 */
public class MainTest {
    public static void main(String[] args) {
        LeiTikTok leiTikTok = new LeiTikTok();

        /**
         * 动态代理机制。
         */
        ManTikTok proxy = JdkTiktokProxy.getProxy(leiTikTok);
        proxy.tiktok();

        ((SellTikTok)proxy).sell();

        //能不能代理被代理对象本类自己的方法?proxy只能转成接口类
//        ((LeiTikTok)proxy).haha();
        System.out.println(Arrays.asList(proxy.getClass().getInterfaces()));

        ManTikTok proxyInstance = (ManTikTok) Proxy.newProxyInstance(
                //第一个参数被代理类的类加载器
                leiTikTok.getClass().getClassLoader(),
                //第二个参数myClac的所以实现接口
                leiTikTok.getClass().getInterfaces(),
                //第三参数是InvocationHandler 这里是lambda简化的匿名内部类写法
//                Object proxy,
//                Method method,
//                Object[] args

                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return method.invoke(leiTikTok,args);
                    }
                }
//                (a, b, c) -> {
//                    System.out.println("我代理了LeiTikTok对象");
//                    return b.invoke(leiTikTok, c);
//                }
        );
        proxyInstance.tiktok();
    }
}

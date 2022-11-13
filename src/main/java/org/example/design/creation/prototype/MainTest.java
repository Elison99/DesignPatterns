package org.example.design.creation.prototype;

/**
 * 是用于创建重复的对象，同时又能保证性能。
 * 1、MyBatis:操作数据库，从数据库里面查出很多记录(70%改变很少)
 * 2、每次查数据库，查到以后把所有数据都封装一个对象，返回。
 * 10000 thread:查-个记录：new User("zhangsan”，18)；每次创建-个对象封装并返回
 * 系统里面就会10000User;浪费内存
 * 3、解决：缓存；查过的保存。
 * 如果再查相同的记录，拿到原来的原型对刻
 */
public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ElksonMybatis elksonMybatis = new ElksonMybatis();

        //十分危险
        //得到克隆体，不怕脏缓存
        User zhangsan1 = elksonMybatis.getUser("zhangsan");
        System.out.println("1===>"+zhangsan1);
        zhangsan1.setUsername("李四");

        User zhangsan2 = elksonMybatis.getUser("zhangsan");
        System.out.println("2====>"+zhangsan2);
        User zhangsan3 = elksonMybatis.getUser("zhangsan");
        System.out.println("3====>"+zhangsan3);
        User zhangsan4 = elksonMybatis.getUser("zhangsan");

    }
}

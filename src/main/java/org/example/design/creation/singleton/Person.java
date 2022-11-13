package org.example.design.creation.singleton;

public class Person {
    private String name;
    private  String age;

    //懒汉、恶汉
//    private final static Person instance = new Person(); //懒汉

    private volatile static  Person instance; //懒汉

    //构造器私有，外部不能实例化
    private Person(){
        System.out.println("创建了Person");
    }

    //提供外部的方法,避免多个线程进入同时创建，static修饰属于类方法，相当于把锁加在类上
    //public static synchronized Person getPerson() 锁太大
    //双重检查锁+内存可见性
    public static Person getPerson(){

        //没有再去创建
        if (instance == null){
           synchronized (Person.class){
               if (instance == null){
                   //还存在指令重排问题，要注意变成先创建对象再分配地址，必须保证可见性
                   Person person = new Person();
                   //双重检验
                   instance = person;
               }
           }
        }

        return instance;
    }
}

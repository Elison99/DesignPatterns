package org.example.design.creation.factory.simplefactory;

/**
 * 简单工厂
 * 1.数量极少
 *
 */
public class WuLinSimpleFactory {
    public  AbstractCar newCar(String type){
        //一切从简，简单工厂核心
        if ("van".equals(type)){
            return new VanCar();
        }else if ("mini".equals(type)){
            return new MiniCar();
        }

        //...

        //更多产品，违反开闭原则。应该直接拓展一个类来造而不是修改代码
        return null;
    }
}

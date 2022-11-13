package org.example.design.creation.factory.abstractfactory;

/**
 * 抽象出来：
 *      可以抽象成抽象类（有些属性也要用）或接口（只有方法）
 */
public class MainTest {
    public static void main(String[] args) {
        WulinFactory wulinFactory = new WulinWuhanMaskFactory();
        AbstractMask abstractMask = wulinFactory.newMask();

        AbstractCar abstractCar = wulinFactory.newCar();

        abstractMask.protectLevel();

        wulinFactory = new WulingGuangzhouFactory();
        abstractMask = wulinFactory.newMask();
        abstractMask.protectLevel();
    }
}

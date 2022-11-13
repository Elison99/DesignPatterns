package org.example.design.creation.factory.abstractfactory;

/**
 * 分厂
 */
public class WulingGuangzhouFactory extends WulinMaskFactory{

    AbstractMask newMask() {
        return new CommonMask();
    }
}

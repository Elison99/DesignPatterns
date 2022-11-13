package org.example.design.creation.factory.abstractfactory;

/**
 * 分厂
 */
public class WulinWuhanMaskFactory extends WulinMaskFactory{

    AbstractMask newMask() {
        return new N95Mask();
    }
}

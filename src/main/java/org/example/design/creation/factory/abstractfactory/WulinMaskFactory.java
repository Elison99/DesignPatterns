package org.example.design.creation.factory.abstractfactory;

/**
 * wulin口罩，谁造口罩谁继承
 */
public abstract class WulinMaskFactory extends WulinFactory{
    AbstractCar newCar() {
        return null;
    }

    abstract AbstractMask newMask() ;
}

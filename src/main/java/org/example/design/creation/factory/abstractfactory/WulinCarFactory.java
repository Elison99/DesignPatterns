package org.example.design.creation.factory.abstractfactory;

/**
 * 汽车集团
 */
public abstract class WulinCarFactory extends WulinFactory{
    abstract AbstractCar newCar();

    AbstractMask newMask() {
        return null;
    }
}

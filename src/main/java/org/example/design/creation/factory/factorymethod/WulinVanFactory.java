package org.example.design.creation.factory.factorymethod;

public class WulinVanFactory extends AbstractCarFactory{
    public AbstractCar newCar() {
        return new VanCar();
    }
}

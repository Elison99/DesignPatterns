package org.example.design.creation.factory.factorymethod;

public class WulinMiniFactory extends AbstractCarFactory{
    public AbstractCar newCar() {
        return new MiniCar();
    }
}

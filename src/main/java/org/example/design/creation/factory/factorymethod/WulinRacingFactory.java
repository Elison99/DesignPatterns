package org.example.design.creation.factory.factorymethod;

public class WulinRacingFactory extends AbstractCarFactory{
    public AbstractCar newCar() {
        return new RacingCar();
    }
}

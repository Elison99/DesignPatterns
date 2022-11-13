package org.example.design.creation.factory.abstractfactory;

public class WulinRacingCarFactory extends WulinCarFactory{
    AbstractCar newCar() {
        return new RacingCar();
    }

}

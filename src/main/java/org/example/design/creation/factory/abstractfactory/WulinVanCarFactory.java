package org.example.design.creation.factory.abstractfactory;

public class WulinVanCarFactory extends WulinCarFactory{
    AbstractCar newCar() {
        return new VanCar();
    }

}

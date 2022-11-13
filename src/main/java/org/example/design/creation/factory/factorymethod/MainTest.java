package org.example.design.creation.factory.factorymethod;

public class MainTest {
    public static void main(String[] args) {
        AbstractCarFactory carFactory = new WulinRacingFactory();
        AbstractCar abstractCar = carFactory.newCar();
        abstractCar.run();

        carFactory = new WulinVanFactory();
        AbstractCar abstractCar1 = carFactory.newCar();
        abstractCar1.run();

    }
}

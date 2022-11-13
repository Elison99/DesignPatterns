package org.example.design.creation.factory.abstractfactory;


public class RacingCar extends AbstractCar {

    public RacingCar(){
         this.engine = "v8发动机";
    }
    public void run() {
        System.out.println(engine+":嗖------");
    }
}

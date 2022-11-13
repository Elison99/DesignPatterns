package org.example.design.creation.factory.abstractfactory;

public class MiniCar extends AbstractCar {

    public MiniCar(){
        this.engine = "四缸水平对置发动机";
    }

    public void run() {
        System.out.println(engine+"---->fly");
    }
}

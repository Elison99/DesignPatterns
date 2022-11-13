package org.example.design.creation.factory.abstractfactory;

public class CommonMask extends AbstractMask {

    public CommonMask(){
        this.price = 1;
    }
    public void protectLevel() {
        System.out.println("common mask...common protection");
    }
}

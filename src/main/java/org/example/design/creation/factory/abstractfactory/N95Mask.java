package org.example.design.creation.factory.abstractfactory;

/**
 * 具体产品
 */
public class N95Mask extends AbstractMask {
    public N95Mask(){
        this.price = 2;
    }
    public void protectLevel() {
        System.out.println("N95Mask...Super Protection");
    }
}

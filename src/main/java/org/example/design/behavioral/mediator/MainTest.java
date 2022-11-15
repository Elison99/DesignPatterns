package org.example.design.behavioral.mediator;

/**
 * 中介者：
 *
 */
public class MainTest {
    public static void main(String[] args) {
        HU8778 hu8778 = new HU8778();
        SC8633 sc8633 = new SC8633();

        ControlTower controlTower = new ControlTower();
        hu8778.setControlTower(controlTower);
        sc8633.setControlTower(controlTower);

        hu8778.fly();

//        hu8778.success();

        sc8633.fly();
    }
}

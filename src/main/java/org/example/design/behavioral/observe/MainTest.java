package org.example.design.behavioral.observe;

public class MainTest {
    public static void main(String[] args) {
        MMTikToker tikToker = new MMTikToker();

        tikToker.startSell();

        RobotFans fans1 = new RobotFans();
        RobotFans fans2 = new RobotFans();
        RobotFans fans3 = new RobotFans();
        fans1.follow(tikToker);
        fans2.follow(tikToker);
        fans3.follow(tikToker);

        HumanFans humanFans = new HumanFans();
        humanFans.follow(tikToker);

        System.out.println("=====>");


        tikToker.endSell();
    }
}

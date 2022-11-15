package org.example.design.behavioral.observe;

public class RobotFans extends AbstractFans{
    @Override
    void acceptMsg(String msg) {
        System.out.println("呸....");
    }
}

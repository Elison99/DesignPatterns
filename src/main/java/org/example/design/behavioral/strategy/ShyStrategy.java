package org.example.design.behavioral.strategy;

/**
 * 冲锋向前策略
 */
public class ShyStrategy implements GameStrategy{
    @Override
    public void warStrategy() {
        System.out.println("shy.....");
    }
}

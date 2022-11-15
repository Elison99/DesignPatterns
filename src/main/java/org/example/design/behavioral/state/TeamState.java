package org.example.design.behavioral.state;

/**
 * 抽象状态
 */
public interface TeamState {
    //玩游戏
    void play();

    //切换下一个状态
    TeamState next();
}

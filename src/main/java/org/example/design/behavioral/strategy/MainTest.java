package org.example.design.behavioral.strategy;

public class MainTest {
    public static void main(String[] args) {
        TeamIG teamIG = new TeamIG();

        teamIG.setGameStrategy(new ShyStrategy());
        teamIG.startGame();
    }
}

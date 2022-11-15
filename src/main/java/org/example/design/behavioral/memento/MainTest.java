package org.example.design.behavioral.memento;

import java.lang.reflect.InvocationTargetException;

public class MainTest {
    public static void main(String[] args) throws Exception {


        LeiGamer leiGamer = new LeiGamer();

        leiGamer.playGame();

        //第一次保存
        leiGamer.saveGameRecord();

        leiGamer.playGame();

        leiGamer.playGame();

        leiGamer.saveGameRecord();


        LeiGamer fromMemento = leiGamer.getFromMemento(1);

        fromMemento.playGame();

    }
}

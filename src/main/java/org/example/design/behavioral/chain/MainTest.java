package org.example.design.behavioral.chain;

/**
 *         //1、链条的引用点
 *         //2、下一个继续
 *         //3、构造链条
 *
 *   回旋责任链
 *   Filter：1 -- 2 -- 3 -- 本人 -- 3 -- 2 -- 1
 *
 */
public class MainTest {
    public static void main(String[] args) {
        Teacher leishen = new Teacher("Leisehn");

        Teacher xiaokui = new Teacher("xiaokui");

        Teacher mengmeng = new Teacher("mengmeng");

        leishen.setNext(xiaokui);
        xiaokui.setNext(mengmeng);

        leishen.handleRequest();
    }
}

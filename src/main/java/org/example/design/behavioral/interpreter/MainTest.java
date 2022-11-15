package org.example.design.behavioral.interpreter;

public class MainTest {
    public static void main(String[] args) {
        Area area = new Area();

        /**
         *  上海市：张文宏-医生
         *  武汉市:雷神-程序员
         *  北京市：宋宋-老人
         */
        String sr = "北京市:雷神-程序员";

        area.getTicket(sr);
    }
}

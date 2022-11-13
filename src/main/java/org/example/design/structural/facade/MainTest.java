package org.example.design.structural.facade;


/**
 * 需求：来回跑太麻烦，按照最少知道原则，我就想和一个部门进行交互。
 *
 *
 *
 */
public class MainTest {

    public static void main(String[] args) {

//        Police police = new Police();
//        police.resgister("雷");
//
//        Edu edu = new Edu();
//        edu.assignSchool("雷");
//
//        Social social = new Social();
//        social.handleSocial("雷");

        WeiXinFacade facade = new WeiXinFacade();

        facade.handleXxx("雷");
//
//        facade.resgister("");
//        facade.assignSchool("");

    }
}

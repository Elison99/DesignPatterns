package org.example.design.structural.proxy.dynamic;

public class LeiTikTok implements ManTikTok,SellTikTok{
    @Override
    public void tiktok() {
        System.out.println("雷神，Tik Tok...");
    }

    @Override
    public void sell() {
        System.out.println("雷声之锤，只要666，赶紧来买...");
    }

    public void haha(){
        System.out.println("hahaha ,......");
    }
}

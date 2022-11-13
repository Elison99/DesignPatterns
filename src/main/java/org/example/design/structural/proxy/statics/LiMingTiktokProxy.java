package org.example.design.structural.proxy.statics;

/**
 * 代理一般都是和被代理对象属于同一个接口
 */
public class LiMingTiktokProxy implements ManTikTok{

    private ManTikTok manTikTok; //被代理对象

    public LiMingTiktokProxy(ManTikTok manTikTok){
        this.manTikTok = manTikTok;
    }

    @Override
    public void tiktok() {
        //增强功能
        System.out.println("渲染直播间....");
        System.out.println("飞机只要666，仅此一天....");
        manTikTok.tiktok();
    }
}

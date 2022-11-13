package org.example.design.structural.decorator;

public class EnhancedDecorator implements TiktokDecorator{

    //    private Framework framework;  适配器

    private ManTikTok manTikTok;
    public EnhancedDecorator(ManTikTok manTikTok){
        this.manTikTok = manTikTok;
    }

    @Override
    public void tiktok() {
        //开启美颜
        enable();

        //开始直播
        manTikTok.tiktok();
    }

    /**
     * 定义的增强功能
     */
    @Override
    public void enable() {
        System.out.println("看这个美女.....");
        System.out.println("花花花花花花花花花花花");
    }
}

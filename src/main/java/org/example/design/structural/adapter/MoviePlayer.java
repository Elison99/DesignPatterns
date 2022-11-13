package org.example.design.structural.adapter;

public class MoviePlayer implements Player {
    @Override
    public String play() {
        System.out.println("正在播放适应器模式");
        String content = "你好";
        System.out.println(content);  //并且打印出字幕
        return content;
    }
}

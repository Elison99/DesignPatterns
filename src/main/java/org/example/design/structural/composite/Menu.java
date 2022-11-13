package org.example.design.structural.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Menu {
    private Integer id;
    private String name;
    public Menu(Integer id,String name){
        this.id = id;
        this.name = name;
    }

    //组合模式关注点
    private List<Menu> childs = new ArrayList<>();
    //提供添加层级的方法
    void addChildMenu(Menu menu){
        childs.add(menu);
    }

    //层级遍历方法
    void printMenu(String begin){
        System.out.println(begin+name);
        begin+="--";
        if (childs.size() > 0){
            for (Menu child : childs) {
                child.printMenu(begin);
            }
        }
    }
}

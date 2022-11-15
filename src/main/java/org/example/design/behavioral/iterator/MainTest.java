package org.example.design.behavioral.iterator;

public class MainTest {
    public static void main(String[] args) {

        MaYuCheng cheng = new MaYuCheng();

        cheng.likeYou("王刚");
        cheng.likeYou("李强");
        cheng.likeYou("赵根");

        BeautifulMan.Itr iterator = cheng.getIterator();
        String s = iterator.firstLove();
        System.out.println(s);

        String current = iterator.current();
        System.out.println(current);

        System.out.println("=======================");
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}

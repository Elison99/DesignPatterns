package org.example.design.creation.builder;

public class MainTest {
    public static void main(String[] args) {
        XiaomiBuilder builder = new XiaomiBuilder();

        //建造这个手机
//        builder.customMem("16G");
//        builder.customDisk("512G");
//        builder.customCam("1亿");
//        builder.customCpu("骁龙888");

//        Phone product = builder.getProduct();
        //链式建造者
        Phone product = builder.customCpu("骁龙888").customMem("16G").customCam("1亿").customDisk("512G").getProduct();

        Phone aaa = Phone.builder()
                .cpu("aaa")
                .cam("1000万").
                mem("16G")
                .disk("513G")
                .build();

        System.out.println(product);
        System.out.println(aaa);
    }
}

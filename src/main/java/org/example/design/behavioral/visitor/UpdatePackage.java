package org.example.design.behavioral.visitor;

public class UpdatePackage implements Vistor{

    private String ext;

    public  UpdatePackage(String ext){
        this.ext = ext;
    }

    @Override
    public void visitDisk(Disk disk) {
        System.out.println(disk.command += ">>>="+ext);
    }

    @Override
    public void visitCPU(CPU cpu) {
        //改属性为例
        cpu.command += ">>>> "+ext;
        //装饰模式。改方法
    }

    @Override
    public void visitFoot(Foot foot) {
        foot.command += " >>>> "+ext;
    }
}

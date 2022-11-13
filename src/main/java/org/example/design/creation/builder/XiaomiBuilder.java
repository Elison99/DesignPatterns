package org.example.design.creation.builder;

public class XiaomiBuilder extends AbstractBuilder{

    public XiaomiBuilder(){
        phone = Phone.builder().build();
    }

    AbstractBuilder customCpu(String cpu) {
        phone.cpu = cpu;
        return this;
    }

    AbstractBuilder customMem(String mem) {
        phone.mem = mem;
        return this;
    }

    AbstractBuilder customDisk(String disk) {
        phone.disk = disk;
        return this;
    }

    AbstractBuilder customCam(String cam) {
        phone.cam = cam;
        return this;
    }
}

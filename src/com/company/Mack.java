package com.company;

public class Mack extends NoutBook{
    private String camera;


    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public Mack(String processor, String ram, int size, String camera) {
        super(processor, ram, size);
        this.camera = camera;
    }

    @Override
    public void print() {
        System.out.println("Процессор: "+ getProcessor()+
                "\nРам: "+getRam()+
                "\nРазмер: "+getSize()+
                "\nКамера: "+camera);
    }
}

package com.company;

public class Lenovo extends NoutBook{
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Lenovo(String processor, String ram, int size, String material) {
        super(processor, ram, size);
        this.material = material;
    }

    @Override
    public void print() {
        System.out.println("Процессор: "+ getProcessor()+
                "\nРам: "+getRam()+
                "\nРазмер: "+getSize()+
        "\nМатериал: "+material+
                "\n-------------------------------");
    }
}

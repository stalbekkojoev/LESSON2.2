package com.company;

public class Hp extends NoutBook{
    private String dinamic;


    public String getDinamic() {
        return dinamic;
    }

    public void setDinamic(String dinamic) {
        this.dinamic = dinamic;
    }

    public Hp(String processor, String ram, int size, String dinamic) {
        super(processor, ram, size);
        this.dinamic = dinamic;
    }

    @Override
    public void print() {
        System.out.println("Процессор: "+ getProcessor()+
                "\nРам: "+getRam()+
                "\nРазмер: "+getSize()+
                "\nДинамик: "+dinamic+
                "\n-------------------------------");
    }
}

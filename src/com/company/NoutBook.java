package com.company;

public abstract class NoutBook implements Printable{
    private String processor;
    private String ram;
    private int size;

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public NoutBook(String processor, String ram, int size) {
        this.processor = processor;
        this.ram = ram;
        this.size = size;
    }
}

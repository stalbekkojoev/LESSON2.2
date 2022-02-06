package com.company;

public class Main {

    public static void main(String[] args) {
        Printable[] comp={createObject("Lenovo"),createObject("Hp"),createObject("Mack")};
        for (Printable printable:comp ) {
            printable.print();

        }
    }

    public static Printable createObject(String NoutBook) {
        return switch (NoutBook) {
            case "Lenovo" -> new Lenovo("Двух ядерный","8",15,"Альюминовой");
            case "Hp" -> new Hp("Чтерех ядерный","12",18,"Хороший");
            case "Mack" -> new Mack("Шесть ядерный","16",12,"12mp");
            default -> null;

        };


    }
}

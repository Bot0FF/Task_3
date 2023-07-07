package org.aplana.sweetpresent;

public class Chocolate extends Sweet{
    private String color;

    public Chocolate(String name, int weight, int price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "Цвет='" + color + '\'' +
                super.toString() + '}';
    }
}

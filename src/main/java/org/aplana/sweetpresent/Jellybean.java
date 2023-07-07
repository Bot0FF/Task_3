package org.aplana.sweetpresent;

public class Jellybean extends Sweet {
    private String smell;

    public Jellybean(String name, int weight, int price, String smell) {
        super(name, weight, price);
        this.smell = smell;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Jellybean{" +
                "Запах='" + smell + '\'' +
                super.toString() + '}';
    }
}

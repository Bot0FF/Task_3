package org.aplana.sweetpresent;

public class Candy extends Sweet{
    private String taste;

    public Candy(String name, int weight, int price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "Вкус='" + taste + '\'' +
                super.toString() + '}';
    }
}

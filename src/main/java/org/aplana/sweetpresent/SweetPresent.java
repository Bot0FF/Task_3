package org.aplana.sweetpresent;

import java.util.Arrays;

public class SweetPresent {
    public static void main(String[] args) {
        Candy candy = new Candy("Candy", 10, 1, "good");
        Jellybean jellybean = new Jellybean("Jellybean", 15, 2, "bad");
        Chocolate chocolate = new Chocolate("Chocolate", 20, 3, "black");
        Sweet[] present = {candy, jellybean, chocolate};
        int allWeight = candy.getWeight() + jellybean.getWeight() + candy.getWeight();
        int allPrice = candy.getPrice() + jellybean.getPrice() + candy.getPrice();
        System.out.println(String.format("Общий вес подарка: %d \nОбщая стоимость подарка: %d", allWeight, allPrice));
        Arrays.stream(present).forEach(System.out::println);
    }
}

package org.aplana.sweetpresent;

import java.util.Arrays;

public class SweetPresent {
    public static void main(String[] args) {
        int allWeight = 0, allPrice = 0;
        Candy candy = new Candy("Candy", 10, 1, "good");
        Jellybean jellybean = new Jellybean("Jellybean", 15, 2, "bad");
        Chocolate chocolate = new Chocolate("Chocolate", 20, 3, "black");
        Sweet[] present = {candy, jellybean, chocolate};
        for(Sweet sweet : present) {
            allWeight += sweet.getWeight();
            allPrice += sweet.getPrice();
            System.out.println(sweet.toString());
        }
        System.out.println(String.format("Общий вес подарка: %d \nОбщая стоимость подарка: %d", allWeight, allPrice));
    }
}

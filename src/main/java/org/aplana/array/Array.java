package org.aplana.array;

import java.util.*;

public class Array {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        while (list.size() < 20) {
            int n = getRNumMinMax(-10, 10);
            if(!list.contains(n)) {
                list.add(n);
            }
        }
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println("\n");
        Arrays.stream(replaceAB(arr)).forEach(System.out::print);
    }

    public static int[] replaceAB(int[] arr) {
        int posA = 0;
        int posB = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == -10) {
                posA = i;
            }
            if(arr[i] == 1) {
                posB = i;
            }
        }
        arr[posA] = 1;
        arr[posB] = -10;

        return arr;
    }

    //рандом по min и max
    public static int getRNumMinMax(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}

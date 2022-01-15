package main.java.bo0k.generics;

import java.util.ArrayList;
import java.util.List;

public class BoundedWildCardUseApp {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        integerList.add(99);
        integerList.add(1990);
        double integerListSum = BoundedWildCardUse.sum(integerList);
        System.out.println("Integer List is " + integerList);
        System.out.println("Sum of Integer List is " + integerListSum);
    }
}

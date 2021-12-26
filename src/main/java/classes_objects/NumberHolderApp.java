package main.java.classes_objects;

public class NumberHolderApp {
    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder();
        numberHolder.aFloat = 1.2f;
        numberHolder.anInt = 7;
        System.out.println(numberHolder.aFloat);
        System.out.println(numberHolder.anInt);
    }
}

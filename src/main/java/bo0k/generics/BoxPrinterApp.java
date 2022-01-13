package main.java.bo0k.generics;

public class BoxPrinterApp {
    public static void main(String[] args) {
//        BoxPrinter boxPrinter1 = new BoxPrinter(10);
//        BoxPrinter boxPrinter2 = new BoxPrinter("oops");
//        Integer testVal = (Integer) boxPrinter2.getVal();
        BoxPrinter<Integer> boxPrinter1 = new BoxPrinter<>(29);
        System.out.println(boxPrinter1.toString());
        BoxPrinter<String> boxPrinter2 = new BoxPrinter<>("11");
        System.out.println(boxPrinter2.toString());
        Integer integerVal = Integer.parseInt(boxPrinter2.getVal());
        System.out.println(integerVal);
    }
}

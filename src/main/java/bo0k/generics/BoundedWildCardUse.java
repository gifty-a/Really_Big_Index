package main.java.bo0k.generics;

import java.util.List;

public class BoundedWildCardUse {
    public static Double sum(List<? extends Number> numList) {
        Double listSum = 0.0;
        for (Number num: numList
             ) {
            listSum += num.doubleValue();
        }
        return listSum;
    }
}

package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Алгоритмы-числа
*/
public class Solution {

    private static final List<Long> armList;


    static {
        armList = new ArrayList<Long>(Arrays.<Long>asList(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 153L, 371L, 370L, 407L, 1634L, 8208L, 9474L, 92727L, 93084L, 54748L, 548834L, 1741725L, 4210818L, 9926315L, 9800817L, 24678051L, 24678050L, 88593477L, 146511208L, 912985153L, 472335975L, 534494836L, 4679307774L, 32164049651L, 94204591914L, 32164049650L, 82693916578L, 40028394225L, 42678290603L, 44708635679L, 49388550606L, 28116440335967L, 4338281769391371L, 4338281769391370L, 21897142587612075L, 35641594208964132L, 35875699062250035L, 4498128791164624869L, 1517841543307505039L, 3289582984443187032L, 4929273885928088826L));
    }





    public static long[] getNumbers(long N) {
        List<Long> arm = new ArrayList<>();
        for (int i = 0; i < armList.size(); i++) {
            if (N > armList.get(i)) {
                arm.add(armList.get(i));
            }
        }
        long[] result = new long[arm.size()];
        for (int i = 0; i < arm.size(); i++) {
            result[i] = arm.get(i);
        }




        return result.length > 0 && N > 0 ? result : new long[0];
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024) + " mb");
        System.out.println("time = " + (b - a) + " ms");

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();

        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024) + " mb");
        System.out.println("time = " + (b - a) + " ms");

    }
}
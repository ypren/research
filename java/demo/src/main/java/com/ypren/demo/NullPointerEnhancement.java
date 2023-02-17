package com.ypren.demo;

import java.util.ArrayList;

/**
 * NullPointerException enhancement test.
 *
 */
public class NullPointerEnhancement {
    public static void main(String[] args) {
        test();
    }

    /**
     * After run this method, will report as follows:
     *
     * Cannot invoke "java.lang.Integer.longValue()"
     * because the return value of "java.util.ArrayList.get(int)" is null
     */
    public static void test() {
        var list = new ArrayList<Integer>();
        list.add(null);
        System.out.println(list.get(0).longValue());
    }
}

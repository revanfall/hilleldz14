package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Sorting sort=new Sorting(new int[]{51,2,6,8,12,2,1,5,7,123,3});
        System.out.println(Arrays.toString(sort.insertSort()));
        System.out.println(sort.interpolationSearch(6));
    }
}

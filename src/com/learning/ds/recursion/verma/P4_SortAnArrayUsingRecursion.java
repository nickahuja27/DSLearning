package com.learning.ds.recursion.verma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P4_SortAnArrayUsingRecursion {
    public static void main(String[] args) {
        Integer[] inArray = {1,3,2,5,4,7,6,9,8};
        List<Integer> inList = new ArrayList<>(Arrays.asList(inArray));
        sort(inList);
        System.out.println(inList);
    }

    private static void sort(List<Integer> inList) {
        if(inList.isEmpty())
            return;

        int lastIndex = inList.size() - 1;
        int currentNum = inList.remove(lastIndex);
        sort(inList);
        placeNumberSorted(inList, currentNum);
    }

    private static void placeNumberSorted(List<Integer> inList, int numToAdd) {
        if(inList.isEmpty() || inList.get(inList.size() - 1) <= numToAdd) {
            inList.add(numToAdd);
            return;
        }
        int lastNum = inList.remove(inList.size() - 1);
        placeNumberSorted(inList, numToAdd);
        inList.add(lastNum);
    }
}

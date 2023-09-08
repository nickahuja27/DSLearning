package com.learning.ds.recursion.verma;

public class P1_FindSubsetsOfAString {
    public static void main(String[] args) {
        findSubSets("", "abc");
    }

    private static void findSubSets(String outString, String inString) {
        if(inString.length() <= 0) {
            System.out.println("subset: {" + outString + "}");
            return;
        }
        findSubSets(outString, inString.substring(1));
        findSubSets(outString + inString.charAt(0), inString.substring(1));
    }
}

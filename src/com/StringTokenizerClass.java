package com;

import java.util.Arrays;
import java.util.List;

public class StringTokenizerClass {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Mercury","Venus","Mars");
        String resultString=String.join(",",list);
        System.out.println(resultString);
    }
}

package com.lyq.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(5);
        //System.out.println(map.size());

        LinkedList<String> lList = new LinkedList<>();

        LinkedHashSet<String> lHSet = new LinkedHashSet<>();

        TreeSet<String> tSet = new TreeSet<>();
        tSet.add("String");
        tSet.add("Abbas");
        System.out.println(tSet);
    }

    @Test
    public void test(){
        String str = "1212";
        str = ("1212" == str) ? "121" : str;
        System.out.println(str);
    }


}

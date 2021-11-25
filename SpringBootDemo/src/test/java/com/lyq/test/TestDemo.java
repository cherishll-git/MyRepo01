package com.lyq.test;

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
        tSet.add("Zero");
        System.out.println(tSet);
    }
}

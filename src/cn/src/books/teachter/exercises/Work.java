package cn.src.books.teachter.exercises;

import java.util.Arrays;

/**
 * Created by Administrator
 * * 2016/7/4.
 */
public class Work {
    public static void main(String[] args) {
        String s = "hello...";
        String s1 = "hi...";
        String s2 = "hello word..";
        String s3 = "hello word..";
        String s4 = "Hello Word..";

        System.out.println(s.charAt(0));
        System.out.println(s.concat(s));
        System.out.println(s.contains(s));
        System.out.println(s.endsWith(s1));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s4));
        System.out.println(String.format(s, ""));
        System.out.println(s.indexOf(s2));
        System.out.println(s.isEmpty());
        System.out.println(s.lastIndexOf(s));
        System.out.println(s.length());
        System.out.println(s.matches(s));
        System.out.println(s.replaceAll("张三","男"));
        System.out.println(s.replaceFirst("王五","女"));
        System.out.println(Arrays.toString(s.split(s)));
        System.out.println(s.startsWith(s));
        System.out.println(s.substring(1));
        System.out.println(s.toCharArray());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(String.valueOf(1.2));


    }


}


package cn.src.books.teachter.teaching;

import sun.text.resources.cldr.ia.FormatData_ia;

import java.util.Iterator;

/**
 * Created by 9329940344@qq.com
 * 2016/6/30
 */
public class Array {
    public static void main(String[] args) {
        int[] ints = new int[8];
        for (int i=0;i<ints.length;i++) {
            ints[i]=i;
        }
        System.out.println(ints[0]);
        System.out.println(ints.length);
        String[]strings={"test", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi"};
        System.out.println(strings.length);
        System.out.println(strings[strings.length-1]);


        for (String string : strings) {
            System.out.println(string);
        }
}


}

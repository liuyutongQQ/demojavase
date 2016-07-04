package cn.src.books.teachter.teaching;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by Administrator
 * * 2016/7/1.
 */
public class Array2DTest {
    public static void main(String[] args) {
        String[][] strings = new String[3][5];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = i + ":" + j;
            }

        }
        System.out.println(strings[2][4]);
        System.out.println(strings[0].length);
        System.out.println(strings[1].length);
        System.out.println(strings[2].length);

        int[][]ints=new int[3][];
        ints[0]=new int[4];
        ints[1]=new int[1];
        ints[2]=new int[10];

        double[][]doubles={
                {1,2,3},
                {4,5,6},
                {7,8,9,10}
        };
        System.out.println(doubles[doubles.length-1][doubles[doubles.length-1].length]);

        for (double[]aDouble:doubles){
            for (double v:aDouble){
                System.out.println(v+"\t");
            }
            System.out.println();
        }
    }
}

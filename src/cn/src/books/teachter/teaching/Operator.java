package cn.src.books.teachter.teaching;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Operator {
    public static void main(String[] args) {
        int x=20;
        int y=60;
        int z=++x-y--;
        Double a=1.4;
        Double b=1.8;
        Double c=a++*--b;
       int q= 100;
        int w=200;
        Boolean e=q>w;
        Boolean R=x>y||x<y;
        int i= 1;
        //i+=1;
        //i%=100;//i%100=0.01
        int g=(x>y)?(x+y):(x-y);
        int k=2;
        short k2= (short) k;
        int l=1;
        int m=i++;
        m=--i;
       // System.out.println(i);
        System.out.println(z);
        System.out.println(y);
        System.out.println(x);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(e);
        System.out.println(R);
        System.out.println(i);
        System.out.println(g);
        System.out.println(k2);
        System.out.println(m);
    }

}

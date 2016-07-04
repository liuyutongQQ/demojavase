package cn.src.books.teachter.teaching;

/**
 * Created by 932940344@qq.com
 on 2016/6/24
 */
public class Subclass extends Superclass {
    int j;

    void m3(){

    }


}
class Subclasstext{
    public static void main(String[] args) {

        Superclass superclass = new Subclass();
        System.out.println(superclass.i);
        superclass.m1();

        Subclass subclass = new Subclass();
        System.out.println(subclass.j);
        System.out.println(subclass.d);
        subclass.m3();
    }
}
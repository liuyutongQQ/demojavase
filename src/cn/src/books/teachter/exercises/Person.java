package cn.src.books.teachter.exercises;

/**
 * Created by Administrator
 * 2016/6/28.
 */
public class Person {
    private String name;
    private static String earth;
//    public static void
    public static void main(String[] args) {
        earth="地球";
        System.out.println(earth);
        Person zhangsan=new Person();
        zhangsan.name="张三";
        zhangsan.earth="张三在清华";
        Person lisi=new Person();
        lisi.name="李四";
        System.out.println(zhangsan.name);
        System.out.println(zhangsan.earth);
        System.out.println(lisi.name);
        System.out.println(lisi.earth);
    }
}

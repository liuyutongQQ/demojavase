package cn.src.books.teachter.teaching;

/**
 * Created by 9329940344@qq.com
 * 2016/6/30
 */
public class CallByValue {


    public static void main(String[] args) {
        Customer c1=new Customer("Justin");
       // some(c1);
        System.out.println(c1.name);
    }
}
class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }
}
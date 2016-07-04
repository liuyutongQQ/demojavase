package cn.src.books.teachter.teaching;

/**
 * Created by Administrator on 2016/6/21.
 */
public class If {
    public static void main(String[] args) {
      int score=90;
        if (score>=80) {
            System.out.println("A");
        }
       else if (score>=70) {
            System.out.println("B");
        }
        else {
            if (score >= 60) {
                System.out.println("C");
            } else {
                System.out.println("passed");
            }
        }
    }
}

package cn.src.books.teachter.teaching;

/**
 * Created by liuyutongQQ@qq.com
 on 2016/6/23
 */
public class Vehicle {
    String color;
    String brand;
   double price;
    double speed;


    public Vehicle(double speed, String color, String brand, double price) {
        this.speed = speed;
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    public void run(String time){
        System.out.println("run"+time);
    }
    public void stop(String time,int hour){
        System.out.println("stop"+time+",at"+hour);
    }

    public int busload(int number){
        System.out.println("busload"+number);
        return number;
    }
//    public void speed(){
//
//    }
public static void main(String[] args) {
    Vehicle car = new Vehicle(100, "red", "现代", 10.5);
    System.out.println(car.color);
    System.out.println(car.brand);
    System.out.println(car.price);
    System.out.println(car.speed);
    car.stop("12", 5);
}
}

/**
 * Created by 932940344@qq.com
 * on 2016/6/24
 */
public class Human {
    String name;
    String gender;
    int age;
    double height;
    double weight;
    boolean isMarried;


    public Human(String name) {
        this.name = name;
    }

    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public Human(String name, String gender, int age, double height, double weight, boolean isMarried) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.isMarried = isMarried;
    }

    public void eat(String food, String time) {
        System.out.println(name + " eat " + food + ", at " + time);
    }

    public int sleep(int hour) {
        System.out.println(name + " sleep " + hour);
        return hour;
    }

    public String study(String content) {
        System.out.println("study " + content);
        return content;
    }

    public void work() {

    }
}


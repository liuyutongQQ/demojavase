package cn.src.books.teachter.exercises;

/**
 * Created by Administrator
 * 2016/6/28.
 */
public abstract class Shape {

    public abstract double acreage();

    public abstract double  perimeter();

    public static void main(String[] args) {

    }
}
class Square extends Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double acreage() {

        return length*length;
    }

    @Override
    public double perimeter() {

        return length*4;
    }

    class Rectangle extends Shape {
        private double width;
        private double height;
        @Override
        public double acreage() {

            return width*height;
        }

        @Override
        public double perimeter() {

            return(width+height)*2;
        }
    }

    class Triangle extends Shape {

        @Override
        public double acreage() {

            return 0;
        }

        @Override
        public double perimeter() {

            return 0;
        }
    }

    class Circle extends Shape {
        @Override
        public double acreage() {

            return 0;
        }

        @Override
        public double perimeter() {

            return 0;
        }
    }
}


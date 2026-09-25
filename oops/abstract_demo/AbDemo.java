package oops.abstract_demo;
/*Create an abstract class Shape with a concrete 
method void info() printing "Shape info" and an 
abstract method double area(). A subclass Square 
stores side and implements area() as side*side. 
Read a side, create a Square, print info() then the 
integer part of area(). */
public class AbDemo {
    public static void main(String[] args) {
        Square sq = new Square(5);
        System.out.println(sq.area());
        sq.info();
    }
}
abstract class Shape{
    void info(){
        System.out.println("Shape info");
    }
    abstract double area();
}

class Square extends Shape{
    int s;
    Square(int s){
        this.s=s;
    }
    double area(){
        return s*s;
    }
}
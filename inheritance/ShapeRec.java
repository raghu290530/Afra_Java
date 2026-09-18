package inheritance;

public class ShapeRec {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
    }
}

class Shape{
    void info(){
        System.out.println("This is a shape");
    }
}
class Rectangle extends Shape{

}
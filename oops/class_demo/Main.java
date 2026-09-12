package oops.class_demo;

public class Main {
    public static void main(String[] args) {
        System.out.println("raghu");
        Student s1 = new Student();
        s1.name = "Raghu";
        s1.age = 30; 
        s1.display();
        Main m = new  Main();
        printDetails(); // No error
        m.printDetails();
        m.nonStatic();
        // nonStatic(); error
    }
    public  static  void printDetails(){
        System.out.println("static");
    }
    public void nonStatic(){
        System.out.println("Non Static");
    }
}

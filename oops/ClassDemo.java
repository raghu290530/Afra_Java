package oops;

public class ClassDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Afra";
        s1.age = 20;
        s1.display();
        Student s2 = new Student();
        s2.name = "Raghu";
        s2.age = 30;
        s2.display();
        s1.display();
        Student s3 = new Student();
        s3.display();
        
    }
}

class Student{
    String name="Student";
    int age = 60;
    public void display(){
        System.out.println("Name :" + name);
        System.out.println("Age : " + age);
    }
}

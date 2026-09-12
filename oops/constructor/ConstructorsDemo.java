package oops.constructor;
/*it is special method the name is same as class name
it will be call automatiiclly whenever an object is created
It can be used to set initial values for object attributes:

 */
public class ConstructorsDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Raghu",30);
        Student s2 = new Student("Afra",20);
        s1.printDetails();
        s2.printDetails();
    }
}

class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void printDetails(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


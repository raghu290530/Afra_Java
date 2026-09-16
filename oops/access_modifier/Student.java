package oops.access_modifier;

public class Student {
    public static void main(String[] args) {
        Person p = new Person("Raghu", 30);
        System.err.println(p.name);
        // System.out.println(p.age); error
    }
}

class Person{
    public String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}
package oops;

public class Hierarchial {
    public static void main(String[] args) {
        B1 b = new B1();
        C1 c = new C1();
        D1 d = new D1();
        System.out.println(b.a);
        b.greet();
        System.out.println(c.a);
        c.greet();
        System.out.println(d.a);
        d.greet();
    }
}

class  A1{
    int a=5;
    public void greet(){
        System.out.println("Hello");
    }
}

class B1 extends A1{
    int b = 10;
}

class C1 extends A1{
    int c = 20;
}

class D1 extends A1{
    int d = 30;
}
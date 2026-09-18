package inheritance;

public class DemoInh {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.x);
        B b = new B();
        // System.out.println(b.y);
        System.out.println(b.x);
        b.greet();

    }
}

class A{
    int x = 5;
    void greet(){
        System.out.println("Hello");
    }
}
class B extends A{
}
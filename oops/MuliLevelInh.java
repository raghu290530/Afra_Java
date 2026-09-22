package oops;

public class MuliLevelInh {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.a+" "+c.b+" "+c.c);
        c.greet();
    }
}

class  A{
    int a=5;
    public void greet(){
        System.out.println("Hello A");
    }
}
class B extends A{
    int b = 10;
     public void greet(){
        System.out.println("Hello B");
    }
}

class C extends B{
    int c = 20;
     public void greet(){
        System.out.println("Hello C");
    }
}
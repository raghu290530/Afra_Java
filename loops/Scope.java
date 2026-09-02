package loops;

public class Scope {
    public static void main(String[] args) {
        int n = 10;
        {
            int a = 15;
            System.out.println(n);
        }
        System.out.println(n);
        // System.out.println(a);
        int i=0;
        for (; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println(i);
        System.out.println(n);
        int b = 8;
        System.out.println(b);
    }
    private static void myMethod(){
        int b;
        b = 20;
    }
}

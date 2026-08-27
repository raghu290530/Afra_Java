package methods;
/*Find the factorial of 3 diffrent nos */
public class Fact3 {
    public static void main(String[] args) {
        int N1 = 5,N2=6,N3=3;
        int f1=1;
        for(int i=1;i<=N1;i++){
            f1 = f1*i;
        }
        System.out.println("Factorial of "+N1+" is "+f1);
        int f2=1;
        for(int i=1;i<=N2;i++){
            f2 = f2*i;
        }
        System.out.println("Factorial of "+N2+" is "+f2);
        int f3=1;
        for(int i=1;i<=N3;i++){
            f3 = f3*i;
        }
        System.out.println("Factorial of "+N3+" is "+f3);
    }
}

package methods;

public class FactReturn {
    public static int fact(int N){
        int f = 1;
        for(int i=1;i<=N;i++){
            f = f*i;
        }
        System.out.println("Factorial of "+N+" is "+f);
        return f;
    }
    public static void main(String[] args) {
        int N1 = 5;
        int f = fact(N1);
        System.out.println(f);
        System.out.println(fact(6));
    }
}

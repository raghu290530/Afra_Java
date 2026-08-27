package methods;
/*W.A.P to add two nos using function - take  3 values diffrent inputs */
public class FactMethod {
    public static void main(String[] args) {
        int N1 = 5,N2=6,N3=3;
        fact(N1);
        fact(N2);
        fact(N3);
    }
    public static void fact(int N){
        int f = 1;
        for(int i=1;i<=N;i++){
            f = f*i;
        }
        System.out.println("Factorial of "+N+" is "+f);
    }
}

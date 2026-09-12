package methods.recurtion;
/*W.A.P to find the fatorial using recurtion */
public class SumOfNatural {
    public static void main(String[] args) {
        System.out.println(sumNatural(5));
    }
    public static int sumNatural(int n){
        if(n==1){
            return 1;
        }
        return n + sumNatural(n-1);
    }
    // 5 + 10
    // 4 + 6
    // 3 + 3
    // 2 + 1
}

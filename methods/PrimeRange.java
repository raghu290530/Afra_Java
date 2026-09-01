package methods;
/*prime factors of a gien numbers
6 -> 2,3
28 -> 2,7

*/

public class PrimeRange {
    public static void main(String[] args) {
        primeRange(1, 100);
        System.out.println(isPrime(50));
        primeFactors(100);
    }

    public static boolean isPrime(int n){
        if (n==1) return false;
        for(int i=2;i<n/2+1;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void primeRange(int n1,int n2){
        for(int i=n1;i<=n2;i++){
            if (isPrime(i))
                System.out.print(i+ " ");
        }
    }
    public static void primeFactors(int n){
        for(int i=1;i<n/2+1;i++){
            if (n%i==0 && isPrime(i))
                System.out.print(i+ " ");
        }
    }
}

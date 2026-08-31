package methods;
/*isEven, isPrime, isPalindrome 
return true or false
using functions print range of even numbers 10 20 -> 10 12 14 16 18 20
*/
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(isEven(6));
        System.out.println(isOdd(5));
        System.out.println(isOdd(6));
    }

    static boolean isEven(int n){
        if(n%2==0)
            return true;
        return false;
    }

    static boolean isOdd(int n){
        if(n%2 == 1)
            return true;
        return false;
    }
}

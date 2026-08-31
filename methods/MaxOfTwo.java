package methods;
/*Write a function max_of_two(a, b) 
that returns the larger of the two numbers.
 */
public class MaxOfTwo {
    public static void main(String[] args) {
        System.out.println(maxOfTwo(8,10));
        System.out.println(maxOfTwo(20,10));
    }
    public static int maxOfTwo(int a,int b){
        if(a>b)
            return a;
        return b;
    }
}

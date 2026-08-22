package arrays;

import java.util.Scanner;

/*Linerar Search
W.A.P to search an element in an array. 
[] a = {32,45,23,64,56,89,66} 
 t = 64 -> Available
 t = 20 -> Not Available
*/
public class SearchLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int T = sc.nextInt(); // Target
        // [] a = {32,45,23,64,56,89,66} 
        // t = 64 -> Available
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (T == a[i]) {
                count++;
            }
        }
        if (count>=1) {
            System.out.println(T+" is Avaliable");
        }else{
            System.out.println(T + " is Not available");
        }
    }
}

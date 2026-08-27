package arrays;

import java.util.Scanner;

/* a[] = {8,0,5,9,0,0,6} -> {8,5,9,6,0,0,0}
zero[]= [0,0,0]
non_zero[] = {8,5,9,6}
new_array[] = {8,5,9,6,0,0,0}
 */
public class MovingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []a = new int[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int result[] = new int[N];
        /*a= {8,0,5,9,0,0,6} 
        result = {8,5,0,0,0,0,0}*/
        for (int i = 0,j=0; i < a.length; i++) {
            if(a[i]!=0){
                result[j] = a[i];
                j++;
            }
            // for (int k = 0; k < result.length; k++) {
            // System.out.print(result[k] + " ");
            // }
            // System.out.println();
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

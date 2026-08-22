package arrays;

import java.util.Scanner;

/* W.A.P to find maximum and minimum element of array
[] a = {32,45,23,64,56,89,66} 
 max = 89
 min = 23

*/
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float[] a = new float[N];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextFloat();
        }
        float max = a[0];//a,b -> 
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Max = "+max);
        
    }
}

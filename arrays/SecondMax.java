package arrays;

import java.util.Scanner;

public class SecondMax {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("enter the array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int secmax=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if (a[i] != max){
                secmax = a[i];
                break;
            }
        }
        for(int i=1;i<a.length;i++){
            if(a[i]>secmax && a[i]!=max){
                secmax=a[i];
            }
        }
        System.out.println("secmax is:" + secmax);
    }
}

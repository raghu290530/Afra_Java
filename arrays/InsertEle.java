package arrays;

import java.util.Scanner;

/* a[] = {15,30,6,7,10} 
po - ele
2 - 20
*/
public class InsertEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter ele:");
        int ele = sc.nextInt();
        System.out.println("Enter Position");
        int po = sc.nextInt();
        int newa[] = new int[N+1];
        if (po>=0 && po<a.length) {
            
            for(int i=0;i<newa.length;i++){
                if(i<po){
                    newa[i]=a[i];
                } else if(i==po){
                    newa[i]=ele;
                }else{
                    newa[i]=a[i-1];
                }
            }
            for (int i = 0; i < newa.length; i++) {
                    System.out.print(newa[i]+" ");
            }
        } else{
            System.out.println("Insertion not possible");
        }
    }
}

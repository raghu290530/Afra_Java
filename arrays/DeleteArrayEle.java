package arrays;

import java.util.Scanner;
/* a[] = {1,3,6,7,10} */
public class DeleteArrayEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int ele = sc.nextInt();
        int[] newa = new int[N-1];
        int po = -1;
        for(int i=0;i<a.length;i++){
            if (ele == a[i]){
                po = i;
                break;
            }
        }
        if (po>-1){
            for(int i=0;i<newa.length;i++){
                if(i<po){
                    newa[i] = a[i];
                }else{
                    newa[i] = a[i+1];
                }
                
            }
            for (int i = 0; i < newa.length; i++) {
                System.out.print(newa[i]+" ");
            }
        }
        else{
            System.out.println("Deletion is possible");
        }

    }
}



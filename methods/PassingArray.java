package methods;

public class PassingArray {
    public static void main(String[] args) {
        int[] arr = {8,9,45,5,9,454,78};
        int n=5;
        printArray(arr);

        int[] b = {7,9,8,5}; 
        modifyArray(b);  // call by reference
        printArray(b);

        modifyNum(n); // call by value
        System.out.println(n);

    }

    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void modifyArray(int[] a){
        a[1] = 20;
    }
    public static void modifyNum(int n){
        n = 10;
    }
}

package arrays;

public class ForEachDemo {
    public static void main(String[] args) {
        int[] a = {5,9,8,9,6,7};
        for (int e : a) {
            System.out.println(e);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

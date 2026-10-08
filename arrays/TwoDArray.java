package arrays;

public class TwoDArray {
    public static void main(String[] args) {
        // int[] a = {4,5,9,6};
        // int[] b = new int[5];
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i]+" ");
        // }
        int[][] m = {{5,9,8},{4,3,6},{8,6,8},{9,8,6},{4,9,55}};
        System.out.println(m.length);
        System.out.println(m[0].length);
        System.out.println(m[1].length);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(m[1][2]);
    }
}

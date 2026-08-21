package arrays;
//Binary - 0 1
//Decimal - 0 1 2 3 4 5 6 7 8 9 
//Octal - 0 1 2 3 4 5 6 7
//HexaDecimal - 0 1 2 3 4 5 6 7 8 9 A B C D F
public class ArrayDemo {
    public static void main(String[] args) {
        int a[] ={45,78,98,12,56,34,43,67,87};
        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[4]);
        a[2] = 30;
        System.out.println("Length - "+ a.length);
        // System.out.println(a[5]); Error
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

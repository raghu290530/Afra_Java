package methods.recurtion;

public class PrintNNaturalNos {
    public static void main(String[] args) {
        number(5);
        numberBack(5);
    }
    public static void number(int n){
        if(n==0){
            return;
        }
        number(n-1);
        System.out.println(n);
    }
     public static void numberBack(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        numberBack(n-1);
        
    }

}

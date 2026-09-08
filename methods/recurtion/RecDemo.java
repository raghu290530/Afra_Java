package methods.recurtion;
/*Calling a function by it self 
1. must have arguments
in evry call arguments shuld increase or decrease
2. stopping poin in if condition*/
public class RecDemo {
    public static void main(String[] args) {
        printName(5);
    }
    public static void printName(int n){
        if (n==0){
            return;
        }
        System.out.println("Raghu");
        printName(n-1);
    }
}

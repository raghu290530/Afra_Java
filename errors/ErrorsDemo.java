package errors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
        } catch(InputMismatchException e){
            System.out.println("Enter a and b values only Integers");
        } catch(ArithmeticException e){
            System.out.println("b should not be zero");
        } catch(Exception e){
            System.out.println("Something went wrong");
        }
        
        sc.close();
    }
}

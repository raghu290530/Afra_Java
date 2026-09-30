package errors;

public class ThrowDemo {
    public static void main(String[] args) {
        int age=12;
        if(age<=18){
            throw new ArithmeticException("404");
        } else{
            System.out.println("Access Granted");
        }
    }
}

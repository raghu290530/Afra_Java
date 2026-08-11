package switch_chapter;

import java.util.Scanner;

public class VendingMc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        switch(code){
            case 1 : System.out.println("Coffee");
                     break;
            case 2 : System.out.println("Tea");
                     break;
            case 3 : System.out.println("Green Tea");
                     break;
            case 4 : System.out.println("Black Coffee");
                     break;
            case 5 : System.out.println("Black Tea");
                     break;
            default : System.out.println("Beep Sound");
                     break;
        }
    }
}

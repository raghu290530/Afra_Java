package switch_chapter;

import java.util.Scanner;

/*•	W.A.P to print season names according to user input (corresponding its number). */
public class Seasons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch(month){
            case 1:  case 2:  case 11:
            case 12: System.out.println("Winter"); break;
            case 3: 
            case 4: 
            case 5: 
            case 6: System.out.println("Summer"); break;
            case 7: 
            case 8: 
            case 9: 
            case 10: System.out.println("Rainy"); break;
            default:System.out.println("Wrong input");

        }
    }
}

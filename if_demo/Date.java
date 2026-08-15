package if_demo;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int month=sc.nextInt();
        int year=sc.nextInt();
        if(year%4==0){
                if( month==1|| month==3 || month==5 || month==7 || month==8 || month==10 || month==12 ){
                    if(day>=1&&day<=31){
                        System.out.println("valid date");
                    }else{
                        System.out.println("invalid date");
                    }
                }else if(month==4 || month==9 || month== 11){
                    if(day>=1 && day<=30){
                            System.out.println("valid date");
                    }else{
                        System.out.println("invalid dte");
                    }
                }else if(month==2 && day>=1 && day <=29 && year%4==0){
                    System.out.println("it is valid");
                }else{
                    System.out.println("invalid date");
                    }
            }else{
                System.out.println("invalid date");
            }
        }
}
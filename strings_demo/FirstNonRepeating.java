package strings_demo;
/*
1. find the frequency of each charator in a string 
s = "Hello"
H - 1
e - 1
l - 2
o - 1
2. Seperate unique charectors fron a given string or remove duplicates
s = "Heelloe"
us = "Helo";
*/
import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        firstNonRepeatingChar(s);
        String s1 = "Raghu";
        
    }
    public  static void firstNonRepeatingChar(String s){
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int c = 0;
            for(int j=0;j<s.length();j++){
                if(ch == s.charAt(j)){
                    c++;
                }
            }
            if (c==1) {
                System.out.println(ch);
                return;
            }
        }
        System.out.println("-1");
    }
}

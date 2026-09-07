package strings_demo;
import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(toggleCaseASCII(s));
    }
    public static String toggleCase(String s){
        String rs = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                rs = rs + Character.toLowerCase(ch);
            }else if (Character.isLowerCase(ch)){
                rs = rs + Character.toUpperCase(ch);
            }else{
                rs = rs + ch;
            }
        }
        return rs;
       }
    public static String toggleCaseASCII(String s){
        String rs = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>=65 && ch<=90){
                rs = rs + (char)(ch+32);
            }else if (ch>=97 && ch<=122){
                rs = rs + (char)(ch-32);
            }else{
                rs = rs + ch;
            }
        }
        return rs;
    }
}

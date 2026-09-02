package methods;

public class MethodOverLoad {
    /*Method overloading 
    same functions name but diffretr type of arguments 
    or diffretn no of argument or diffretn return type
        */
    public static void main(String[] args) {
        printName("Raghu");
        printName(5);
    }
    public static void printName(String name){
        System.out.println(name);
    }
    public static void printName(int n){
        System.out.println(n);
    }
    public static float printName(float n){
        return n;
    }
}

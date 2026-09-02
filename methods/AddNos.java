package methods;

public class AddNos {
    public static void main(String[] args) {
        System.out.println(add(5,6));
        System.out.println(add(5,6,9));
        System.out.println(add(5.6f,9));
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static float add(float a, float b){
        return a+b;
    }
}

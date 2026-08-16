package loops;
/*break is used */

public class BreakDemo {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.print(i+" ");
            if (i<=3)
                break;
        }
        System.out.println("Out of loop");
    }
}

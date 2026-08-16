package loops;

public class ContinueDemo {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if (i>=3)
                break;
            else if (i==2)
                continue;
            System.out.print(i+" ");
        }
        System.out.println("Out of loop");
    }
}

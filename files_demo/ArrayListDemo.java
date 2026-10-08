package files_demo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(20);
        a.add(50);
        a.add(30);
        a.add(60);
        a.add(10);
        a.sort(null);
        System.out.println(a);
        for (Integer e : a) {
            System.out.println(e);
        }
    }
}

package methods;
import methods.FactMethod;
import methods.recurtion.*;
import strings_demo.*;
public class Demo {
    public static void main(String[] args) {
        FactMethod fc = new FactMethod();
        fc.fact(5);
        ToggleCase tc = new ToggleCase();
        System.out.println(tc.toggleCase("Hello Eorld"));
        SumOfNatural sn = new SumOfNatural();
        System.out.println(sn.sumNatural(5));

    }
}

package oops.swim;
/*Define interfaces Runnable with void run() and 
Swimmable with void swim(). A class Amphibian implements both,
 printing "Running" and "Swimming". In main call both methods. */
public class InterfaceDemo {
    public static void main(String[] args) {
        Amphibian a = new Amphibian();
        a.run();
        a.swim();
    }
}
interface Runnable{
    public void run();
}
interface Swimmable{
    public void swim();
}
class Amphibian implements Runnable, Swimmable{
    public void run(){
        System.out.println("Running");
    }
    public void swim(){
        System.out.println("Swimming");
    }
}

package strings_demo;

public class StringDemo {
    public static void main(String[] args) {
        String name  = "Raghua"; 
        System.out.println(name);
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        name = name.toUpperCase();
        System.out.println(name);
        name = name.toLowerCase();
        System.out.println(name);
        String myStr = "Split a string and by spaces, and also punctuation.";
        String[] myArray = myStr.split("and");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        
    }
}

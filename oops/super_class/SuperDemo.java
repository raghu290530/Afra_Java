package oops.super_class;

public class SuperDemo {
    public static void main(String[] args) {
        Child c = new Child("Raghu",30);
        c.printPDetails();
    }
}

class Parent{
    protected String pname;
    protected  int page;
    Parent(String pname,int page){
        this.pname = pname;
        this.page = page;
    }
}

class Child extends Parent{
    Child(String pname,int page){
        super(pname, page);
    }
    public void printPDetails(){
        System.out.println(pname);
        System.out.println(page);
    }
}
package oops.super_class;

public class SuperDemo2 {
    public static void main(String[] args) {
        Child1 c = new Child1("Raghu",30,"Advi",6);
        c.printPDetails();
        c.printCDetails();
    }
}

class Parent1{
    protected String pname;
    protected  int page;
    Parent1(String pname,int page){
        this.pname = pname;
        this.page = page;
    }
}

class Child1 extends Parent{
    String cname;
    int cage;
    Child1(String pname,int page,String cname,int cage){
        this.cage = cage;
        this.cname = cname;
        super(pname, page);
    }
    public void printPDetails(){
        System.out.println(pname);
        System.out.println(page);
    }
    public void printCDetails(){
        System.out.println(cname);
        System.out.println(cage);
    }
}
package oops.access_modifier;

public class GetSet {
    public static void main(String[] args) {
        Employee1 e = new Employee1();
        e.setId(50);
        System.out.println(e.getId());
    }
}
class Employee1{
    private int id;
    private float sal;
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public  void setSal(float sal){
        this.sal =sal;
    }
    public float getSal(){
        return this.sal;
    }
}
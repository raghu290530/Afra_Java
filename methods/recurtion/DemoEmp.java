package methods.recurtion;
/*Write a class Employee with private __name and __salary and getters/setters for both.
 */
public class DemoEmp {
    public static void main(String[] args) {
        
    }
}
class Employee{
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employee(String name, float sal) {
        this.name = name;
        this.sal = sal;
    }
    private String name;
    private float sal;
    public float getSal() {
        return sal;
    }
    public void setSal(float sal) {
        this.sal = sal;
    }
}
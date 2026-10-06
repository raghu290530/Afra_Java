package files_demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*read the file find the average of each student and write in new file */
public class StudentData {
    public static void main(String[] args) {
        File f = new File("files_demo\\student_data.txt");
        try(Scanner sc = new Scanner(f)){
            Student3[] s = new Student3[10];
            for (int i=0;i<s.length;i++){
                s[i] = new Student3();
            }
            int i=0;
            while (sc.hasNextLine()) {
                s[i].setName(sc.next());
                s[i].setAge(sc.nextInt());
                s[i].setS1(sc.nextInt());
                s[i].setS2(sc.nextInt());
                s[i].setS3(sc.nextInt());
                s[i].setS4(sc.nextInt());
                s[i].setS5(sc.nextInt());
                i++;
            }
            File fc = new File("files_demo\\result.txt");
            fc.createNewFile();
            FileWriter fw = new FileWriter("files_demo\\result.txt");
            for(int j=0;j<s.length;j++){
                fw.write(s[j].getName()+" ");
                fw.write(s[j].getAge()+" ");
                fw.write(s[j].getS1()+" ");
                fw.write(s[j].getS2()+" ");
                fw.write(s[j].getS3()+" ");
                fw.write(s[j].getS4()+" ");
                fw.write(s[j].getS5()+" ");
                fw.write(s[j].getAvg()+" ");
                fw.write("\n");
            }
            fw.close();
        } catch(IOException e){
            System.out.println("Error");
        }
    }
}

class Student3{
    private String name;
    private int age,s1,s2,s3,s4,s5;
    private float avg;
    public float getAvg() {
        return (s1+s2+s3+s4+s5)/5.0f;
    }
    public int getS5() {
        return s5;
    }
    public void setS5(int s5) {
        this.s5 = s5;
    }
    public int getS4() {
        return s4;
    }
    public void setS4(int s4) {
        this.s4 = s4;
    }
    public int getS3() {
        return s3;
    }
    public void setS3(int s3) {
        this.s3 = s3;
    }
    public int getS2() {
        return s2;
    }
    public void setS2(int s2) {
        this.s2 = s2;
    }
    public int getS1() {
        return s1;
    }
    public void setS1(int s1) {
        this.s1 = s1;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

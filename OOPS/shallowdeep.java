import java.util.*;
public class shallowdeep {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name= "khushi";
        s1.roll = 20;
        s1.pass="ada";
        s1.marks[0]=41;
        s1.marks[1]=89;
        s1.marks[2]=90;
        //copy constructor
        Student s2= new Student(s1);
        s2.pass = "xyz";
        s1.marks[0]=100;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String pass;
    int marks[];
    Student(){
        marks = new int[3];
        System.out.println("Constructor is called");
    }
    //shallow copy
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name= s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }
    //deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name =s1.name;
        this.roll =s1.roll;
        for(int i=0 ; i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }
    Student(String name){
        marks = new int[3];
        this.name= name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll =roll;
    }



}
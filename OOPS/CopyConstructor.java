public class CopyConstructor {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name= "khushi";
        s1.roll = 20;
        s1.pass = "peelu";
        Student s2 = new Student(s1);
        s2.pass= "xyz";



        
        
    }
}

class Student{
    String name;
    int roll;
    String pass;
    Student(Student s1){
        this.name= s1.name;
        this.roll = s1.roll;
    }
    Student(){
        System.out.println("The Constructor is called");
    }
}

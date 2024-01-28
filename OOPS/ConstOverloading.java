public class ConstOverloading {
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2= new Student("Khushi");
        Student s3= new Student(15);
    }
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("Non Parameterized Constructor");
    }
    Student(String name){
        this.name= name;
    }
    Student(int roll){
        this.roll= roll;
    }

}

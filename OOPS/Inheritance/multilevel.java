public class multilevel {
    public static void main(String[] args){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs= 4;
        System.out.println(dobby.legs);
    } 
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eating");
    }
    void breathe(){
        System.out.println("Breathing");
    }
}
class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}
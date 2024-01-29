public class basic {
    public static void main(String args[]){
        //make object for fish
        Fish shark = new Fish();
        shark.eat();
    }
}
// base class
class Animal{
    String color;
    void eat(){
        System.out.println("eating");
    }
    void breathe(){
        System.out.println("Breathing");
    }
}

//derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swiming");
    }
}

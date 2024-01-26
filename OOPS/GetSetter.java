public class GetSetter {
    public static void main(String args[]){
        // Create object p1 for Pen
        Pen p1= new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Orange");
        System.out.println(p1.getColor());
    }
}
class Pen{
    private String color;
    private int tip;
    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
    void setTip(int tip){
        this.tip =tip;
    }
    int getTip(){
        return this.tip;
    }
}
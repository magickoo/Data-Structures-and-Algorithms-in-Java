import java.util.*;
public class basic {
    public static void main(String[] args) {
        //make object for BankAccount
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Khushi";
        //myAcc.pass = "hello"; will not work
        System.out.println(myAcc.username);
        myAcc.setPass("helllo");
    }
}
class BankAccount{
    public String username;
    private String pass;
    public void setPass(String pwd){
        pass = pwd;
    }
}
class Pen{
    String color;
    int tip;
    String getcolor(){
        return this.color;
    }
    void setcolor(String newcolor){
        color= newcolor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}


public class Testclass {

    public static void main(String[] args) {
        Pen p1 = new Pen();//created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc=new BankAccount();
        myAcc.username = "hk";
        myAcc.setPassword("hello");
    
    }
    
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password =pwd;
    }
}


class Pen {
    String color;
    int tip;

    String getColor(){
        return this.color;
    }

    int  getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip=newTip;


    }
}


class Student{
    String name;
    int age;
    float percentage;

    void calcpercentage(int phy,int chem,int math){
        percentage = (phy+chem+math)/3;
    }
}

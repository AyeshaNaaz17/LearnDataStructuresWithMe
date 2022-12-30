package OOPs;

public class OopsBasic_1 {
    public static void main(String[] args) {


        Pen p1 = new Pen(); // creating object p1 for class Pen
        p1.color = "Yellow";
        System.out.println(p1.color);
        p1.setColor("Blue"); // Accessing Pen class properties and changing them
        System.out.println(p1.color);
        p1.tip = 4;
        p1.setTip(6);
        System.out.println(p1.tip); // prints the latest value updated

        Student s1 = new Student();
        s1.age = 18;
        s1.name = "Abc";
        s1.calcCgpa(90, 94, 98);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.cgpa);


        BankAccount b1 = new BankAccount();
        b1.name = "Def";
//        b1.password = "adsfgh"; - gives error as password is set to private, cannot modify it outside BankAccount class
        b1.setPassword("werttyuijnbv"); // sets the password to this as the operation of assigning password is done in the BankAccount class itself
//        System.out.println(b1.setPassword("ss"));
//        System.out.println(b1.password); - cannot print it because password is declared as private
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float cgpa;

    void calcCgpa(int phy, int chem, int math){
        cgpa = (phy + chem + math) / 3;
    }
}


class BankAccount{
    public String name; // accessible outside the class
    private String password; // only accessible in this class

    void setPassword(String pwd){
        password = pwd;
    }
}
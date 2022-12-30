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

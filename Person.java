import java.lang.*;

public class Person {
    private int nationalId;
    private String name;
    private double height;
    private int age;

    void setNationalId(int an) {
        this.nationalId = an;
    }

    void setName(String ahn) {
        this.name = ahn;
    }

    void setHeight(double h) {
        this.height = h;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getNationalId() {
        return nationalId;
    }

    String getName() {
        return name;
    }

    double getHeight() {
        return height;
    }

    int getAge() {
        return age;
    }

    public void showDetails() {
        System.out.println("National Id: " + nationalId);
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person obj1 = new Person();
        obj1.setNationalId(123356);
        obj1.setName("soccho");
        obj1.setHeight(5.11);
        obj1.showDetails();
        obj1.setAge(22);
        Person obj2 = new Person();
        obj2.setNationalId(123356);
        obj2.setName("emu");
        obj2.setHeight(4.11);
        obj2.showDetails();
        obj2.setAge(22);
    }
	
}

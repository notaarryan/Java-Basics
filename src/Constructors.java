//Constructors in Java

public class Constructors {
    static int computeCount;

    int id;
    String name;
    String gender;
    int age;
    long phone;
    double gpa;
    char degree;

    boolean international;
    double tutionFee = 12000.0;
    double internationalFee = 5000.0;

    Constructors(int id, String name, String gender, int age, long phone, double gpa, char degree, boolean international){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.gpa = gpa;
        this.degree = degree;
        this.international = international;
    }

    void computeFee() {

        if (international) {
            tutionFee = tutionFee+internationalFee;
        }

        System.out.println("\nId: "+id);
        System.out.println("Name: "+name);
        System.out.println("gender: "+gender);
        System.out.println("age: "+age);
        System.out.println("phone: "+phone);
        System.out.println("gpa: "+gpa);
        System.out.println("degree: "+degree);
        System.out.println("tutionFee: "+tutionFee);
    }

    public static void main(String[] args) {
        Constructors student1 = new Constructors(1000,"Aryan","Male",17,9054220559L,4.9,'B',true);
        student1.computeFee();
    }
}

//ConstructorOverloading in Java

public class ConstructorOverloading {
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

    ConstructorOverloading(int newid, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree, boolean isInternational){
        System.out.println("\nInside Constructor_1\n");
        id = newid;
        name = newName;
        gender = newGender;
        age = newAge;
        phone = newPhone;
        gpa = newGpa;
        degree = newDegree;
        international = isInternational;

        if (international) {
            tutionFee = tutionFee+internationalFee;
        }

        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("gender: "+gender);
        System.out.println("age: "+age);
        System.out.println("phone: "+phone);
        System.out.println("gpa: "+gpa);
        System.out.println("degree: "+degree);
        System.out.println("tutionFee: "+tutionFee);
    }

    ConstructorOverloading(int newid, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree){
        System.out.println("\nInside Constructor_2\n");
        id = newid;
        name = newName;
        gender = newGender;
        age = newAge;
        phone = newPhone;
        gpa = newGpa;
        degree = newDegree;

        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("gender: "+gender);
        System.out.println("age: "+age);
        System.out.println("phone: "+phone);
        System.out.println("gpa: "+gpa);
        System.out.println("degree: "+degree);
        System.out.println("tutionFee: "+tutionFee);
    }



    public static void main(String[] args) {
        ConstructorOverloading student1 = new ConstructorOverloading(1000,"Aryan","Male",17,9054220559L,4.9,'B',true);
        ConstructorOverloading student2 = new ConstructorOverloading(1001,"John","male",20,999999999L,5,'M');
    }
}

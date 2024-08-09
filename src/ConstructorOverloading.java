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
    double tuitionFee = 12000.0;
    double internationalFee = 5000.0;

    ConstructorOverloading(int id, String name, String gender, int age, long phone, double gpa, char degree, boolean international){
        System.out.println("\nInside Constructor_1\n");
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.gpa = gpa;
        this.degree = degree;
        this.international = international;

        if (international) {
            tuitionFee = tuitionFee +internationalFee;
        }

        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("gender: "+gender);
        System.out.println("age: "+age);
        System.out.println("phone: "+phone);
        System.out.println("gpa: "+gpa);
        System.out.println("degree: "+degree);
        System.out.println("tutionFee: "+ tuitionFee);
    }

    ConstructorOverloading(int id, String name, String gender, int age, long phone, double gpa, char degree){
        this(id,name,gender,age,phone,gpa,degree,false);
    }



    public static void main(String[] args) {
        ConstructorOverloading student1 = new ConstructorOverloading(1000,"Aryan","Male",17,9054220559L,4.9,'B',true);
        ConstructorOverloading student2 = new ConstructorOverloading(1001,"John","male",20,999999999L,5,'M');
    }
}

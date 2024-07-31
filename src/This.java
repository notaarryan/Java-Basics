//this() in java

public class This {
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

    This(int newid, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree, boolean isInternational){
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

    This(int newid, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree){
        //this() will find the constructor with most matching constructor
        this(newid,newName,newGender,newAge,newPhone,newGpa,newDegree,false);
    }



    public static void main(String[] args) {
        This student1 = new This(1000,"Aryan","Male",17,9054220559L,4.9,'B',true);
        This student2 = new This(1001,"John","male",20,999999999L,5,'M');
    }
}

public class ThisReferance {
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

    ThisReferance(int id, String name, String gender, int age, long phone, double gpa, char degree, boolean international){
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

    ThisReferance(int newid, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree){
        //this() will find the constructor with most matching constructor
        this(newid,newName,newGender,newAge,newPhone,newGpa,newDegree,false);
    }



    public static void main(String[] args) {
        ThisReferance student1 = new ThisReferance(1000,"Aryan","Male",17,9054220559L,4.9,'B',true);
        ThisReferance student2 = new ThisReferance(1001,"John","male",20,999999999L,5,'M');
    }
}

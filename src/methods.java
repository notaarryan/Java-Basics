public class methods {
    int mark1;
    int mark2;
    static int mark3;

    methods(int _1,int _2,int _3){
        mark1 = _1;
        mark2 = _2;
        mark3 = _3;
    }

    double avg() {
        return (mark1+mark2+mark3)/3;
    }

    public static void main(String[] args) {;
        methods m = new methods(90,80,70);
        methods m2 = new methods(90,99,100);
        double average = m.avg();
        System.out.println(average);
        average = m2.avg();
        System.out.println(average);
    }
}

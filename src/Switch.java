//after each case in switch remember to break using break; or else all the statements will be executed
import java.util.*;

public class Switch {
    static String getSeason (int monthNumber) {
        String season = "";
        switch (monthNumber) {
            case 1:
                System.out.println("Season is Winter");
                season = "Winter";
                break;
            case 2:
                System.out.println("Season is Winter");
                season = "Winter";
                break;
            case 3:
                System.out.println("Season is Winter");
                season = "Winter";
                break;
            case 4:
                System.out.println("Season is Winter");
                season = "Winter";
                break;
            case 5:
                System.out.println("Season is Summer");
                season = "Summer";
                break;
            case 6:
                System.out.println("Season is Summer");
                season = "Summer";
                break;
            case 7:
                System.out.println("Season is Summer");
                season = "Summer";
                break;
            case 8:
                System.out.println("Season is Summer");
                season = "Summer";
                break;
            case 9:
                System.out.println("Season is Spring");
                season = "Spring";
                break;
            case 10:
                System.out.println("Season is Spring");
                season = "Spring";
                break;
            case 11:
                System.out.println("Season is Spring");
                season = "Spring";
                break;
            case 12:
                System.out.println("Season is Spring");
                season = "Spring";
                break;
        }

        //can use comma separated values to remove duplication
        switch (monthNumber) {
            case 1,2,3,4:
                System.out.println("Season is Winter");
                season = "Winter";
                break;
            case 5,6,7,8:
                System.out.println("Season is Summer");
                season = "Summer";
                break;
            case 9,10,11,12:
                System.out.println("Season is Spring");
                season = "Spring";
                break;
        }
        return season;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int monthNumber = sc.nextInt();
        System.out.println();
        String season = getSeason(monthNumber);
        System.out.println(season);
    }
}

import java.util.*;
public class seasons {
    public static void main(String[] args) {
        System.out.println("ENTER THE MONTH");
        Scanner sc=new Scanner (System.in);
        String  month = sc.nextLine();
        sc.close();
        switch(month){
            case "march":
            case "april":
            case "may":
            System.out.println("spring");
            break;
            case "june":
            case "july":
            case "august":
            System.out.println("summer");
            break;
            case "september":
            case "october":
            System.out.println("autumn");
            break;
            case "november":
            case "december":
            case"january":
            case "febraury":
            System.out.println("winter");
            break;
            default:
            System.out.println("invalid");

        }


    }
}

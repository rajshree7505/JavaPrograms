import java.util.*;
public class switchcase {
    public static void main(String[] args) {
    System.out.println("enter the button from 1 2 3 ");
        Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    sc.close();
     switch(a) {
        case 1:
        System.out.println("hello");
        break;
        case 2:
        System.out.println("namste");
        break;
        case 3:
        System.out.println("bonjur");
        break;
        default:
        System.out.println("invalid button");
     }
    }
    
    
}

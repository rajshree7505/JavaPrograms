import java.util.Scanner;
public class inputs {
    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String name= sc.next();
        System.out.println(name);
        System.out.println("enter your roll");
        int roll= sc.nextInt();
        sc.close();
        System.out.println(roll);


    }
    
}

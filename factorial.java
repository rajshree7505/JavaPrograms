import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int num, fact = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = scan.nextInt();
        scan.close();

        for(int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is " + fact);
    }
    }
    


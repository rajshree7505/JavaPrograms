import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        int r,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range :");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number for the range: ");
        int num2 = sc.nextInt();
        sc.close();
        System.out.print("\nDisplay the even numbers between " + num1 + " and " + num2 + " are :");
        for (i = num1; i <= num2; i++) {
            r = i % 2;
            if (r == 0)
                System.out.println(i);
        }
        System.out.print("\nDisplay the odd numbers between " + num1 + " and " + num2 + " are :");
        for (i = num1; i <= num2; i++) {
            r = i % 2;
            if (r == 1)
                System.out.println(i);
        }
    }
}
    
        
            

        

            



            


        
    

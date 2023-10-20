import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        int n;
        System.out.println("enter any no");
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         sc.close();
         if(n%2==0)
         System.out.println("number is even");
         else
         System.err.println("the number is odd");








    }
}

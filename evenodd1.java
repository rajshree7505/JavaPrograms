import java.util.Scanner;
public class evenodd1 {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the no");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        sc.close();
        System.out.println(n%2==0?"the nois even":":the no is odd");

    }
    
}

import java.util.Scanner;
public class swapwithout3var {
    public static void main(String[] args) {
    
        System.out.println("enter the two no a and b");
        Scanner sc = new Scanner(System.in);
          int a= sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print(a );
        System.out.println(b);


        

    }
    
}

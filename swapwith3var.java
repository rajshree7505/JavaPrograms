import java.util.Scanner;
public class swapwith3var {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter the 2 no a and b");
        Scanner sc=  new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        c=a;
        a=b;
        b=c;
        System.out.print(a);
        System.out.println(b);
    }
    
}

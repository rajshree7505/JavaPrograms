import java.util.Scanner;
public class greatest {
    public static void main(String[] args) {
        int a ,b, c;
        System.out.println("enter 3 no ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sc.close();
       System.out.println(a>b&&a>c?a:b>a&&b>c?b:c);

        
    }
    
}

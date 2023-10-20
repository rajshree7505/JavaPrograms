import java.util.Scanner;
public class areaofrect {
    public static void main(String[] args) {
        int a,b,area;
        System.out.println("enter length of rectangle");
         Scanner sc= new Scanner(System.in);
             a = sc.nextInt();
        System.out.println("enter the breath of rectangle");
          b=sc.nextInt();
          sc.close();
           area= a*b;
           System.out.println(area);

    }
    
}

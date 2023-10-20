import java.util.*;
public class calculator {
    public static void main(String[] args) {
        System.out.println("enter two no"); 
        Scanner sc = new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(" choose operation"+'\n'+ "1.addition"+'\n'+ "2.subtraction"+'\n'+"3.multipication"+'\n'+"4.division" );

        
        int operator= sc.nextInt();
        sc.close();
        switch(operator){
         case 1:
          int sum= a+b;
          System.out.println(sum);
         break;
         case 2:
         int sub= a-b;
         System.out.println(sub);
         break;
         case 3:
         int mul=a*b;
         System.out.println(mul);
         break;
         case 4:
         int div=a/b;
         System.out.println(div);
         break;
         default:
         System.out.println("invalid operation");
         
        }
    
    }
    
}

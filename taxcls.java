import java.util.*;
public class taxcls {
    public static void main(String[] args) {
        System.out.println(" enter the salary");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n<10000){
            System.out.println("no tax");}
        else if(10000<n && n<20000){
            System.out.println("10 per tax");}
        else if(20000<n && n<30000)    {
            System.out.println("15 per tax");        }
            else {
                System.out.println(" 25 per tax");
            }
        }

        

            
        
    }


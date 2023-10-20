import java.util.*;
public class temper {
    public static void main(String[] args) {
        System.out.println("enter the temperature in celsius");
        Scanner sc= new Scanner(System.in);
        double fahrenheit,a,b, celsius;
        celsius= sc.nextDouble();
        System.out.println("enter temp in fahrenheit");
        a=sc.nextDouble();
        sc.close();
        fahrenheit =( (celsius*9)/5)+32;
        System.out.println( " Temp in fahrenheit");  
        System.out.println(fahrenheit);
        b = (  ((a)-32)*5)/9 ;
        System.out.println(" The temp in celsius");
        System.out.println( b);
        
                        




    }
    
}

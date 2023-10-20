import java.util.*;
public class leapyear1 {
    public static void main(String[] args) {
        System.out.println("enter the year");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n%4==0){
            System.out.println("the year is leap");}
        else if (n%400==0){
            System.out.println("the year is leap year");}
        else{
            System.out.println("not aleap year");
        }    
    }
}
            
                
        

    
    


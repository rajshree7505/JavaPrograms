import java.util.*;
public class disountcal {
    public static void main(String[] args) {
       System.out.println(" costumer bill");
       int k =1000; 
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.close();
       if (n<1*k &&  n<5*k){
        System.out.println(" 5% off");}
       else if ( n<5*k && n<10*k){
        System.out.println(" 10 % off");}
       else if (n<10*k && n<20* k){
        System.out.println(" 15 % off"); }
        else {
            System.out.println( "25 % off");
        }


       }     
        }
       
         

    
    


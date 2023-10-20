import java.util.*;
public class calender {
    public static void main(String[] args) {
        System.out.println(" enter the week day from 1 t0 7");
        Scanner sc = new Scanner(System.in);
          int n= sc.nextInt();
          sc.close();
          if( n==1){
            System.out.println("monday");}
          else if( n==2){
            System.out.println("tuesday");}
          else if(n==3){
            System.out.println("wednesday");}
          else if (n==4){
            System.out.println("thrusday");}
          else if (n==5){
            System.out.println("friday");}
          else if( n==6){
            System.out.println("sat");}
            else if (n==7){
                System.out.println("sunday");}
                else {
                    System.out.println(" invalid ");
                }
            }
        }

            

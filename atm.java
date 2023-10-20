import java.util.*;
public class atm {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        int balance =1000;
        
        System.out.println(" enter your choice");
        System.out.println("1.check balance");
        System.out.println("2.deposite money");
        System.out.println("3.money withdraw");
        int ch=sc.nextInt();
        
        switch(ch){
            case 1:
            System.out.println(balance);
            break;
            case 2:
            System.out.println("enter deposite money");
            int money=sc.nextInt();
            System.out.println(balance+money);
            break;
            case 3:
            System.out.println("enter withdraw money");
            int withdraw=sc.nextInt();
            System.out.println(balance -withdraw);
            break;
             default:
             System.out.println("invalid");
             sc.close();

        }
    }
    
}

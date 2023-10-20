import java.util.*;
public class digitsum {
    public static void main(String[] args) {
        int a ,sum=0;
        System.out.println("enter the digit");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        sc.close();
        while(n>0){
         a=n%10;
         n=n/10;
        sum= sum+a;
        }
    System.out.println(sum);

    }
    
}

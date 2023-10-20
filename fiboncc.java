import java.util.*;
public class fiboncc {
    public static void main(String[] args) {
        int a=0, b=1;
        System.out.println("enter the range");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for( int i=0;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(b);
            
    
        }
        
        }
    }
    


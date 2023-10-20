import java.util.Scanner;
public class palindrome {
public static void main(String[] args) {
    int n ,rev=0 ,a ,rem;
    Scanner scan =new Scanner(System.in);
    System.out.println("enter a no");
    n=scan.nextInt();
    scan.close();
    a=n;
    while(n>0){
        rem=n%10;
        n=n/10;
        rev= rem+rev*10;
        
    }
    if(a==rev){
        System.out.println(a+"is a palindrome");
    }else{
        System.out.println(a+"is not a palindrome");

    }

    }
    }

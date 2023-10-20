import java.util.Scanner;

public class reverseofno {
public static void main(String[] args) {
    int n,a,rev=0;
        System.out.println("enter the no");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
         sc.close();
        while(n>0)
        {
            a=n%10;
            rev=rev*10+a;
            n=n/10;
        }System.out.println("the reverse no is"+rev);
}

    
}

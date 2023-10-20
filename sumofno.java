import java.util.Scanner;
public class sumofno {
    public static void main(String[] args) {
        int n,a,sum=0;
        System.out.println("enter the no");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        while(n>0)
        {
            a=n%10;
            sum=sum+a;
            n=n/10;
        }
        System.out.println("sum of digit" + sum);


        }

    }

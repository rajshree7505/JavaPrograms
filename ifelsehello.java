import java.util.Scanner;
public class ifelsehello {
    public static void main(String[] args) {
        System.out.println("press thr button from 1 2 3");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a==1)
        System.out.println("hello");
        else if(a==2)
        System.out.println("namste");
        else if(a==3)
        System.out.println("bonjour");
        else
        System.out.println("invalid button");
        sc.close();
    }
}

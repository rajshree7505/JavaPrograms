import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
       int radius,area,pi=22/7;
        System.out.println("enter the radius of the circle");
        Scanner sc= new Scanner(System.in);
         radius =sc.nextInt();
        sc.close();
        area=2*pi*radius;
        System.out.println(area);

        


    


        
    }
    
}

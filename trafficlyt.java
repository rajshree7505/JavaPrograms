import java.util.*;
public class trafficlyt {
    public static void main(String[] args) {
        System.out.println("choose signal");
        System.out.println("stop");
        System.out.println("ready");
        System.out.println("go");
        Scanner sc=new Scanner(System.in);
        String signal= sc.nextLine();
        sc.close();
        switch(signal){
            case "stop":
            System.out.println("RED");
            break;
            case "ready":
            System.out.println("YELLOW");
            break;
            case "go":
            System.out.println("GREEN");
            

        }

    }
    
}

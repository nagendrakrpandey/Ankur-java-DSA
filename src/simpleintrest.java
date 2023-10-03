import java.util.Scanner;

public class simpleintrest {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the Principal Value");
        int p = sc.nextInt();
        System.out.println("Enter the value of rate");
        int r = sc. nextInt();
        System.out.println("Enter the time ");
        int t = sc.nextInt();
        int SI = (p*r*t)/100;
        System.out.println("The si of these numbers is :"+SI);
    }
}

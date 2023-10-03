import java.util.Scanner;

public class si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal amount");
        int p =sc.nextInt();
        System.out.println("Enter the Rate Of This particular Amount");
        int r = sc.nextInt();
        System.out.println("Enter the The Which are given to clint");
        int T =sc.nextInt();
        int si = p*r*T/100;
        System.out.println("The Si intrest of this particular amount is : "+si);
    }
}

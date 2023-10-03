import java.util.Scanner;

public class Avreagenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of A ");
        int A = sc.nextInt();
        System.out.println("Enter the Value of B");
        int B=sc.nextInt();
        System.out.println("Enter the Value of c");
        int c =sc.nextInt();
        int Average=A+B+c/3;
        System.out.println("The average number is : "+Average);

    }
}

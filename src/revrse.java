import java.util.Scanner;

public class revrse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of N");
        int n = sc.nextInt();
        while(n > 0){
            int lastdigit= n%10;
            System.out.print(lastdigit+"");
            n=n/10;
        }
        System.out.println("");
    }
}

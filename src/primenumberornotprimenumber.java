import java.util.Scanner;

public class primenumberornotprimenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        boolean isprime=true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i ==0){
                isprime=false;
            }

        }
        if(isprime==true){
            System.out.println("N is prime number");
        } else if (n==2) {
            System.out.println("n is prime");

        }
        else{
            System.out.println("n is not prime number");
        }
    }
}

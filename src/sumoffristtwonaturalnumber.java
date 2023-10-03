import java.util.Scanner;

public class sumoffristtwonaturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n");
        int n =sc.nextInt();
        int Ankur=1;
        int sum=0;
        while(Ankur<=n){
             sum+=Ankur;
             Ankur++;
        }
        System.out.println(sum);
    }
}

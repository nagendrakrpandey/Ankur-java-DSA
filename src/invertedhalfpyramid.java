import java.util.Scanner;
public class invertedhalfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n =sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=i; j<=i; j++){
                System.out.println(" ");
            }
            for(int j=0;j<=n-1;j++){
                System.out.print("*");
            }
        }
    }
}

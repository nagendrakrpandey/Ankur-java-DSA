import java.sql.SQLOutput;
import java.util.Scanner;

public class advancepattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the valur of i");
        int n  =sc.nextInt();
        System.out.println("Enter the value of j");
        int m =sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=m; j++){
                if(i==1||i==n||j==1||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

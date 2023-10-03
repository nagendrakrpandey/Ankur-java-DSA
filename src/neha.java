import java.util.Scanner;

public class neha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        for(int neha=1; neha<=n; neha++){
            for(int Ankur=1; Ankur<=neha; Ankur++){
                System.out.print(Ankur);
            }
            System.out.println(" ");
        }
    }
}
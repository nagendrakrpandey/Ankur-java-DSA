import java.util.Scanner;

public class hollowSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row");
        int neha= sc.nextInt();
        System.out.println("Enter the number of column");
        int Ankur=sc.nextInt();
        for(int i=1; i<=neha; i++){
            for(int j=1; j<=Ankur; j++){
                if(i==1||i==neha||j==1||j==Ankur){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}

import java.util.Scanner;

public class invertedhalfpiramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Value of N");
        int N =sc.nextInt();
        //int number='1';
        for(int i=N; i>=1;i--){
             for (int j=1;j<=i;j++){
                System.out.print(j);
                //number++;
            }
            System.out.println(" ");
        }
    }
}

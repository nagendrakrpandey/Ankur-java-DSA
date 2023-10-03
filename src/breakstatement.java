import java.util.Scanner;

public class breakstatement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the VAlue of n");
        int n =sc.nextInt();
        for(int i=0; i<=n;i++){
            if(i%10==0){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Sorry I am out of loop");
    }
}

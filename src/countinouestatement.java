import java.util.Scanner;

public class countinouestatement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Valueb of N");
        int n =sc.nextInt();
        for(int i=0; i<=n; i++){
            if(i==4){
                continue;
            }
            System.out.print(i);
        }
        System.out.println("yes your continue loop is here now");
    }
}

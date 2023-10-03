import java.util.Scanner;

public class printnumber1to10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number ");
        int Ankur=sc.nextInt();
        int i=1;
        while(i<=Ankur){
            System.out.println(i);
            i++;
        }
    }
}

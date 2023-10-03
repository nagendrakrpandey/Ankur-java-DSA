import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value Of A");
        int A=sc.nextInt();
        System.out.println("Enter the Value of B");
        int B = sc.nextInt();
        System.out.println("Enter the oprator");
       char oprator =sc.next().charAt(0);
       switch(oprator){
           case '+' :
               System.out.println(A+B);
               break;
           case '-' :
               System.out.println(A-B);
               break;
           case '*' :
               System.out.println(A*B);
               break;
           case '/' :
               System.out.println(A/B);
               break;
           case '%' :
               System.out.println(A%B);
               break;
           default:
               System.out.println("Invalid Oprator");

       }
    }
}

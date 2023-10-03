import java.util.Scanner;

public class scope {
    public static int Neha(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        float a=sc.nextFloat();
        System.out.println("Enter the value of b :");
        float b= sc.nextFloat();
        System.out.println("Enter the value of c :");
        float c  = sc.nextFloat();
        float average = (a+b+c) / 3;
        System.out.println("the average number is the given value : "+average);
        return 0 ;
    }
    public static void main(String[] args) {
        Neha();
    }
}

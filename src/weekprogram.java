import java.util.Scanner;

public class weekprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the Days");
        int Day=sc.nextInt();

        switch(Day){
            case 1 :
                System.out.println("Today is Monday");
            break;
            case 2 :
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednusday");
                break;
            case 4 :
                System.out.println("Today is Thrusday");
                break;
            case 5 :
                System.out.println("Today is Friday");
                break;
            case 6 :
                System.out.println("Today is Friday");
                break;
            case 7 :
                System.out.println("Today is Saturday");
                break;
            case 8 :
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Today is leave Day");


        }
    }
}

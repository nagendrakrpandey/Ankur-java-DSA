public class callbyvalue {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int temp=a;
        a=b;
        b=temp;

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}

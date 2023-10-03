public class productofaandb {
    public static int product(int a, int b){
        int product =a*b;
        return product;

    }
    public static void main(String[] args) {
        int a =3;
        int b=10;
        int prod=product(a,b);
        System.out.println("a*b="+prod);
    }
}

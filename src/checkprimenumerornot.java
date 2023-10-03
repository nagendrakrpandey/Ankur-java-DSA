public class checkprimenumerornot {
    public static boolean prime(int n){
        boolean sprime=true;
        for(int i=2; i<=n-1; i++){
            if(n % i==0){
            sprime=false;
            break;
            }
        }
        return sprime;
    }

    public static void main(String[] args) {
        System.out.println(prime(5));
    }
}

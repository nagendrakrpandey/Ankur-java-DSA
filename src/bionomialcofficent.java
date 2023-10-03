public class bionomialcofficent {
    public static int fact(int n){
        int f=1;
        for (int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static int ncr(int n,int r){
        int nfactorial=fact(n);
        int rfactorial=fact(r);
        int nrfactoria=fact(n-r);
        int ncr=nfactorial / (rfactorial * nrfactoria);
        return ncr;
    }

    public static void main(String[] args) {
        System.out.println(ncr(5,2));
    }
}

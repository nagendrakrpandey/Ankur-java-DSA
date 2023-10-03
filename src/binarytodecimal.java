public class binarytodecimal {
    public static void binary(int binNum){
        int pow=0;
        int decNum=0;
            int Mynum = binNum;
        while(binNum>0){
            int lastdigit=binNum%10;
            decNum =decNum+(lastdigit * (int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println(Mynum+ " "+decNum);
    }

    public static void main(String[] args) {
        binary(111);
    }
}

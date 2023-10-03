public class binarysearch {
    public static int Bsearch(int number[], int key){
        int start=0,end;
        for(int i=0; i<number.length; i++){
     if(number[i]==key){
         return i;
     }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16,18};
        int key =10;
    }
}

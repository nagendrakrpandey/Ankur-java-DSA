import java.util.Scanner;

public class LinearSearch {
    public static int search(int number[],int key){
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number []={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
         int key =10;
         int index =search(number,key);
         if(index==-1){
             System.out.println("not found");
         }else {
             System.out.println("index is found : " + index);
         }
    }
}

import java.util.*;

public class BsearchusingRecursion {
    public static int Bsearch(int number[],int key){
        int start =0,end=number.length -1;
            while(start<=end){
                int mid= (start+end)/2;
                if(number[mid]==key){
                    return mid;
                }
                if(number[mid]<key){
                    start = mid+1;
                }else{
                    end=mid -1;
                }
            }
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number[]={1,2,3,4,5,6,7,8,9,9,10,11,12,13,14,560,879,45546,};
        int key=9;
        int index=Bsearch(number,key);
        System.out.println("index of key is : "+ Bsearch(number,key));
    }
}

import java.util.*;

public class ArrayUpdate {

    public static void main(String[] args) {
        int marks[]={95, 95, 99};
        update(marks);
        for (int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
       System.out.println();
    }

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

}

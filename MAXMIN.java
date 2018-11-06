package max_min_moved;

import java.util.Scanner;
import java.io.*;

public class MAXMIN {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int max=0;
        int[] array={1,2,3,4,57,234,3,-90};
        int min=array[0];
        for (int i:array) {
            if (i>max){
                max=i;
            }
            if (i<min){
                min=i;
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j]==max){
                array[j]=min;
            }else{
                if (array[j]==min){
                    array[j]=max;
                }
            }
            System.out.println(array[j]);
        }
    }
}

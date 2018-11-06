package pos_neg;
import java.io.*;
import java.util.Scanner;

public class POSNEG {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] array=new int[5];
        int num=0;
        int pos_amount=0;
        int neg_amount=0;
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();
            if (array[i]<0){
                neg_amount++;
            }else{
                pos_amount++;
            }
        }
        int[] pos_array=new int[pos_amount];
        int[] neg_array=new int[neg_amount];
        pos_amount=0;
        neg_amount=0;
        for (int j = 0; j < array.length; j++) {
            if (array[j]<0){
                neg_array[neg_amount]=array[j];
                neg_amount++;
            }else{
                pos_array[pos_amount]=array[j];
                pos_amount++;
            }
        }
        if (pos_array.length!=0) {
            for (int q = 0; q < pos_array.length; q++) {
                System.out.println(q+1+"th "  + " positive value: " + pos_array[q]);
            }
        }else {
            System.out.println("There's no positive value in the array");
        }
        if (neg_array.length!=0) {
            for (int w = 0; w < pos_array.length; w++) {
                System.out.println(w+1+"th "+ " negative value: " + neg_array[w]);
            }
        }else{
            System.out.println("There's no negative value in the array");
        }

    }
}

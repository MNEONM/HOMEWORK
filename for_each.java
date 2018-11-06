package for_each_task;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] array1=new String[5];
        String[] array2=new String[5];
        String[] array3=new String[5];
        int n=0;
        String sum;
        System.out.println("Type elements of the first array:\n");
        for (int i = 0; i < array1.length; i++) {
            array1[i]=input.next();
        }
        System.out.println("Type elements of the second array:\n");
        for (int j = 0; j < array1.length; j++) {
            array1[j]=input.next();
        }
        for(String l:array1){
            array3[n]=l+array2[n];
            System.out.println("\n"+n+"th element: "+array3[n]);
            n++;
        }
    }
}

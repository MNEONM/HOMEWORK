package matrice;
import java.io.*;
import java.util.Scanner;

public class MATRICE {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] array=new int[2][2];
        int[] iter=new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=input.nextInt();
            }
        }

        iter[0]=array[array.length-1][(array[array.length-1].length)-1];
        System.out.println("\n");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                iter[(j+1)%2]=array[i][j];
                array[i][j]=iter[j%2];
                System.out.println(array[i][j]);
            }
        }
    }
}

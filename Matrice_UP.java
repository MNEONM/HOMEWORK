package matrice_up;

import java.util.Scanner;
import java.io.*;

public class Matrice_UP {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] array=new int[3][3];
        int[] iter=new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=input.nextInt();
            }
        }

        int num=array.length-1;
        int i2=array[0].length-1;
        int extra=0;

        while (i2!=-1){
            if (num==2){
                if (i2==2){
                    iter[1]=array[num][i2];
                    array[num][i2]=array[0][0];
                }
            }
            num--;
            if (i2%2==1){
                extra=1;
            }else{
                extra=0;
            }
            iter[(num+extra + 1) % 2] = array[num][i2];
            array[num][i2] = iter[(num+extra) % 2];
            if (num == 0) {
                i2--;
                num = 3;
            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}

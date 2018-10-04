import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner inp_var=new Scanner(System.in);

        //1st RECTANGLE

        int x_1=inp_var.nextInt();
        int y_1=inp_var.nextInt();
        int x1_1=inp_var.nextInt();
        int y1_1=inp_var.nextInt();

        /*int x2_1=x1_1;
        int y2_1=y_1;
        int x3_1=x_1;
        int y3_1=y1_1;*/

        //2nd RECTANGLE

        int x_2=inp_var.nextInt();
        int y_2=inp_var.nextInt();
        int x1_2=inp_var.nextInt();
        int y1_2=inp_var.nextInt();

        /*int x2_2=x1_2;
        int y2_2=y_2;
        int x3_2=x_2;
        int y3_2=y1_2;*/

        double rec_id=checker(x_1,y_1,x1_1,y1_1,x_2,y_2,x1_2,y1_2,0);
        if(rec_id==1){
            int phantom;

            phantom=x_1;
            x_1=x_2;
            x_2=phantom;

            phantom=y_1;
            y_1=y_2;
            y_2=phantom;

            phantom=x1_1;
            x1_1=x1_2;
            x1_2=phantom;

            phantom=y1_1;
            y1_1=y1_2;
            y1_2=phantom;
        }

        boolean crossing;
        crossing=(y1_1>=y_2 ? (y_1>y1_2 ? false:(x1_1>=x_2 ? (x1_1<=x1_2 ? true:false):false)):false);
        if (crossing==true) {
            double a = checker(x_1, y_1, x1_1, y1_1, x_2, y_2, x1_2, y1_2, 1);
            String mess=(a==3 ? "Figures form a cube" : (a==2 ? "Figures form a rectangle" :(a==5 ? "Figures have a common dot":"Error")));
            System.out.println(mess);
        }else{
            System.out.println("Figures do not cross");
        }

    }

    public static double checker(int x,int y,int x1,int y1,int x2,int y2,int x3,int y3,int state){
        if(state==0){
            double len1 = Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
            double len2 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
            double level=(len1>len2) ? 1:0;
            return level;
        }
        double len1 = Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));
        double len2 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double diff=len1-len2;
        if (len1==len2){
            if(diff==len1){
                return 5;
            }
            return 3;
        }else{
            if(diff==len1){
                return 5;
            }
            return 2;
        }
    }

}

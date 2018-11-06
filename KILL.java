package kill_max_min;

public class KILL {
    public static void main(String[] args) throws Exception {
        int[] array={1,2,3,4,5,7,3123,-21,-211};
        int max=0;
        int min=array[0];
        int n=0;
        for (int i : array) {
            if (i>max){
                max=i;
            }
            if (i<min){
                min=i;
            }
        }

        int[] array2=new int[array.length-2];
        for(int j:array){
            if(j!=min&j!=max){
                array2[n]=j;
                System.out.println(array2[n]);
                n++;
            }
        }

    }
}

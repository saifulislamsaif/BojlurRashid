package fibonacciSeriesUsingArray;


import java.util.Arrays;

public class FibonacciUsingArray {
    public static void main(String[] args) {
        int fn[] = new int[10];
        fn[0]=0;
        fn[1]=1;
        for (int i = 2;i<fn.length;i++){
            fn[i]=fn[i-1] + fn[i-2];
        }
        System.out.println(Arrays.toString(fn));
    }

}

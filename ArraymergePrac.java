package Array;

import java.util.Arrays;

public class ArraymergePrac {
    public static void main(String[] args) {
        int [] a1 = {1,2,3,4,5};
        int [] a2 = {10,20,30};
        int a1length = a1.length;
        int a2length = a2.length;
        int[] merge = new int[a1length+a2length];
        System.arraycopy(a1,0,merge,0,a1length);
        System.arraycopy(a2,0,merge,a1length,a2length);

        System.out.println(Arrays.toString(merge));
    }
}

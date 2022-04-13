package Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MergeSort merge = new MergeSort();
        int[] a = merge.mergeAscending(new int[]{1, 2, 5, 7, 10, 35}, new int[]{1, 2, 3, 9, 10, 25});
        System.out.println(Arrays.toString(a));
        int[] b = {1, 5, 3, 6, 2, 0, 9};
        System.out.println(Arrays.toString(merge.sortDescending(b)));
    }
}

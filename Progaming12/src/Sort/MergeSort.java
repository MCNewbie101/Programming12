package Sort;

public class MergeSort {
    public MergeSort() {

    }
    public int[] mergeAscending(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (i1 >= arr1.length) {
                result[i] = arr2[i2];
                i2++;
                continue;
            }
            if (i2 >= arr2.length) {
                result[i] = arr1[i1];
                i1++;
                continue;
            }
            if (arr1[i1] < arr2[i2]) {
                result[i] = arr1[i1];
                i1++;
            } else  {
                result[i] = arr2[i2];
                i2++;
            }
        }
        return result;
    }

    public int[] mergeDescending(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (i1 >= arr1.length) {
                result[i] = arr2[i2];
                i2++;
                continue;
            }
            if (i2 >= arr2.length) {
                result[i] = arr2[i1];
                i1++;
                continue;
            }
            if (arr1[i1] > arr2[i2]) {
                result[i1] = arr1[i1];
                i1++;
            } else  {
                result[i] = arr2[i2];
                i2++;
            }
        }
        return result;
    }
}

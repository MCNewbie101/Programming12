package Sort;

public class MergeSort {
    public MergeSort() {

    }
    public int[] sortAscending(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int i = arr.length / 2;
        int i2 = 0;
        int[] left = new int[arr.length / 2];
        for (int i1 = 0; i1 < i; i1++) {
            left[i1] = arr[i2];
            i2++;
        }
        left = sortAscending(left);
        i = arr.length - arr.length / 2;
        int[] right = new int[arr.length - arr.length / 2];
        for (int i1 = 0; i1 < i; i1++) {
            right[i1] = arr[i2];
            i2++;
        }
        right = sortAscending(right);
        return mergeAscending(left, right);
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

    public int[] sortDescending(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int i = arr.length / 2;
        int i2 = 0;
        int[] left = new int[arr.length / 2];
        for (int i1 = 0; i1 < i; i1++) {
            left[i1] = arr[i2];
            i2++;
        }
        left = sortDescending(left);
        i = arr.length - arr.length / 2;
        int[] right = new int[arr.length - arr.length / 2];
        for (int i1 = 0; i1 < i; i1++) {
            right[i1] = arr[i2];
            i2++;
        }
        right = sortDescending(right);
        return mergeDescending(left, right);
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
                result[i] = arr1[i1];
                i1++;
                continue;
            }
            if (arr1[i1] > arr2[i2]) {
                result[i] = arr1[i1];
                i1++;
            } else  {
                result[i] = arr2[i2];
                i2++;
            }
        }
        return result;
    }
}

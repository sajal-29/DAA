package DAA;

import java.util.Arrays;

public class orderMergesort {
    public static void main(String[] args) {
        int[] arr = { 1 ,4 ,3 ,2 ,5};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
static int count = 0;
    static void mergeSort(int[] arr, int start, int end) {
        if (end-start == 1) {
            return;
        }
        if(start<end && arr[start]>arr[end] && end-start ==2){
            count++;
        } 
        int mid = (end+start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        merge(arr, start, mid, end);

    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;

            } else {
                mix[k] = arr[j];
                j++;

            }
            k++;
        }
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;

        }
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;

        }
        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }

    }
}



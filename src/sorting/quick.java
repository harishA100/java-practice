import java.util.*;

class QuickSort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];   // pivot value
        int i = low + 1;
        int j = high;

        while (true) {

            while (i <= high && arr[i] <= pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i >= j) {
                break;
            }

            swap(arr, i, j);
        }

        swap(arr, low, j);
        return j;
    }

    static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 10, 6, 8, 1, 5};

        qs(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
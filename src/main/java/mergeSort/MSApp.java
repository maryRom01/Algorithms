import java.util.Arrays;
import java.util.Random;


public class MSApp {

    public static int[] getRandomArray() {
        int[] randoms = new Random().ints(25, 1, 100)
                .toArray();
        return randoms;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }

    public static void mergeSort(int[] arr, int n) {
        if (n < 2) return;
        int mid = arr.length / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int j = mid; j < n; j++) {
            r[j - mid] = arr[j];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(arr, l, r, mid, n - mid);
    }

    public static void merge(int[] arr, int[] l, int[] r, int la, int ra) {
        int i = 0, j = 0, k = 0;
        while (i < la && j < ra) {
            if (l[i] <= r[j]) {
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }
        while (i < la) {
            arr[k++] = l[i++];
        }
        while (j < ra) {
            arr[k++] = r[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = getRandomArray();
        printArray(arr);
        mergeSort(arr, arr.length);
        printArray(arr);
    }
}

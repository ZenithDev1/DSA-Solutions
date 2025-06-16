import java.util.Arrays;

class SelectionSort {
    public static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int smallestIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallestIdx]) {
                    smallestIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestIdx];
            arr[smallestIdx] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {5, 4, 2, 3, 1};
        int n = arr.length;

        selectionSort(arr, n);
        System.out.print(Arrays.toString(arr));
    }
}

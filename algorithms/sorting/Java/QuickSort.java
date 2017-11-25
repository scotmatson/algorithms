import java.util.Arrays;
import java.util.Random;

/*
 * Time Complexity:
 *   Omega(nlogn)
 *   Theta(nlogn)
 *   O(n^2)
 *
 * Space Complexity:
 *   O(logn)
 */
class QuickSort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[20];

        for (int i = 0; i < nums.length; ++i) {
            nums[i] = rand.nextInt(101);
        }

        System.out.println("Unsorted: " + Arrays.toString(nums));
        sort(nums, 0, nums.length-1);
        System.out.println("Sorted: " + Arrays.toString(nums));
    }

    public static void sort(int[] arr, int p, int r) {
        if (p < r) {
            int q = partition(arr, p, r);
            sort(arr, p, q - 1);
            sort(arr, q + 1, r);
        }
    }

    public static int partition(int[] arr, int p, int r) {
        int q = p;
        for (int j = p; j < r; ++j) {
            if (arr[j] <= arr[r]) {
                swap(arr, q, j);
            }
        }
        swap(arr, q, r);
        return q;
    }

    public static void swap(int[] arr, int p, int r) {
        int temp = arr[p];
        arr[p] = arr[r];
        arr[r] = temp;
    }
}

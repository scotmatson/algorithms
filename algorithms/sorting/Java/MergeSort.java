import java.util.Arrays;
import java.util.Random;

/*
 * Time Complexity:
 *   Omega(nlogn)
 *   Theta(nlogn)
 *   O(nlogn)
 *
 * Space Complexity:
 *   O(n)
 */
class MergeSort {

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
            int q = (p + r) / 2;
            sort(arr, p, q);
            sort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    public static void merge(int[] arr, int p, int q, int r) {
        int[] lo = new int[q - p + 1];
        int[] hi = new int[r - q];
        int i, j, k;

        k = p;
        i = j = 0;
        while (k <= q) lo[i++] = arr[k++];
        while (k <= r) hi[j++] = arr[k++];

        k = p;
        i = j = 0;
        while (i < lo.length && j < hi.length) {
            if (lo[i] < hi[j]) arr[k++] = lo[i++];
            else arr[k++] = hi[j++];
        }

        while (i < lo.length) arr[k++] = lo[i++];
        while (j < hi.length) arr[k++] = hi[j++];
    }
}

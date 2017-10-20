
import java.util.Arrays;
import java.util.Random;

public class MergeSortV1 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[20];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(101);
        }

        System.out.println("Unsorted: " + Arrays.toString(nums));
        mergesort(nums, 0, nums.length-1);
        System.out.println("Sorted: " + Arrays.toString(nums));
    }

    public static void mergesort(int[] nums, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergesort(nums, p, q);
            mergesort(nums, q+1, r);
            merge(nums, p, q, r);
        }
    }

    public static void merge(int[] nums, int p, int q, int r) {
        int[] low = new int[q - p + 1];
        int[] high = new int[r - q];

        int i;
        int j;
        int k = p;
        for (i = 0; k <= q; i++, k++) {
            low[i] = nums[k];
        }
        for (j = 0; k <= r; j++, k++) {
            high[j] = nums[k];
        }

        i = 0;
        j = 0;
        k = p;
        while (i < low.length && j < high.length) {
            if (low[i] < high[j]) {
                nums[k] = low[i];
                i++;
                k++;
            } else {
                nums[k] = high[j];
                j++;
                k++;
            }
        }

        while (i < low.length) {
            nums[k] = low[i];
            i++;
            k++;
        }

        while (j < high.length) {
            nums[k] = high[j];
            j++;
            k++;
        }
    }
}

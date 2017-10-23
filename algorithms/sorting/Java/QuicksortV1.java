
import java.util.Arrays;
import java.util.Random;

public class QuicksortV1 {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] nums = new int[20];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(101);
        }

        System.out.println("Unsorted: " + Arrays.toString(nums));
        quicksort(nums, 0, nums.length-1);
        System.out.println("Sorted: " + Arrays.toString(nums));
    }

    public static void quicksort(int[] nums, int p, int r) {
        if (p < r) {
            int j, q = p;
            for (j = p; j < r; j++) {
                if (nums[j] <= nums[r]) {
                    swap(nums, q, j);
                    q++;
                }
            }
            swap(nums, q, r);

            quicksort(nums, p, q-1);
            quicksort(nums, q+1, r);
        }
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}

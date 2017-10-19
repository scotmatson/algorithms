
import java.util.Random;
import java.util.Arrays;


public class InsertionSort {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] nums = new int[20];

        for (int i = 0; i < nums.length; i++) {
          nums[i] = rand.nextInt(101);
        }

        System.out.println("Unsorted: " + Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j-1] > nums[j]) {
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(nums));
    }
}

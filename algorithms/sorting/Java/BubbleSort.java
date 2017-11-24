import java.util.Arrays;
import java.util.Random;

/*
 * Time Complexity:
 *   Omega(n)
 *   Theta(n^2)
 *   O(n^2)
 *
 * Space Complexity:
 *   O(n^2)
 */
class BubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[20];

        for (int i = 0; i < nums.length; ++i) {
            nums[i] = rand.nextInt(101);
        }
        sort1(nums);
    }

    public static void sort1(int[] arr) {
        System.out.println("Unsorted: " + Arrays.toString(arr));
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < arr.length; ++i) {
                if (arr[i] < arr[i-1]) {
                    swap(arr, i-1, i);
                    swapped = true;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(arr));
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}

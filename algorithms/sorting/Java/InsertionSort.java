import java.util.Arrays;
import java.util.Random;

/* 
 * Time Complexity:
 *   Omega(n)
 *   Theta(n^2)
 *   O(n^2)
 *
 * Space Complexity:
 *   O(1)
 */
class InsertionSort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[20];

        for (int i = 0; i < nums.length; ++i) {
            nums[i] = rand.nextInt(101);
        }

        sort(nums);
    }

    public static void sort(int[] arr) {
        System.out.println("Unsorted: " + Arrays.toString(arr));
        for (int i = 1; i < arr.length; ++i) {
            for (int j = i; j > 0 && arr[j-1] > arr[j]; --j) {
                swap(arr, j-1, j);
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

import java.util.Arrays;
import java.util.Random;

/*
 * Time Complexity:
 *     Omega(n^2)
 *     Theta(n^2)
 *     0(n^2)
 *
 * Space Complexity:
 *     0(1)
 */
class SelectionSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[20];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(101);
        }

        sort(nums);
    }

    public static void sort(int[] arr) {
        System.out.println("Unsorted: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; ++i) {
            int min = i;
            for (int j = i+1; j < arr.length; ++j) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(arr, i, min);
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

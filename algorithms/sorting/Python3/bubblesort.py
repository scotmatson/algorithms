#
# bubblesort.py
#

import random

def bubblesort(nums):
    length = len(nums)
    if length > 1:
        # Reverse outer loop, slightly better performance than using
        # a forward outward loop as the space we need to traverse will
        # slowly diminish with each swap.
        for i in range(length-1, 0, -1):
            swapped = False
            # Inner loop
            for j in range(0, i):
                # Obligatory swap
                if nums[j+1] < nums[j]:
                    temp = nums[j]
                    nums[j] = nums[j+1]
                    nums[j+1] = temp
                    swapped = True

            # Opportunity to short circuit to reduce runtime
            if not swapped:
                break;


def main():
    nums = random.sample(range(0, 101), 10)
    print("Unsorted:", nums)
    bubblesort(nums)
    print("Sorted:  ", nums)

if __name__ == "__main__":
    main()

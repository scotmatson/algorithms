#
# Merge Sort
#

import random

def mergesort(list_):
    # Divide the list
    if len(list_) > 1:
        middle = len(list_) // 2
        left = list_[:middle]
        right = list_[middle:]

        # Divide recursively
        mergesort(left)
        mergesort(right)

        i = 0 # Left iterator
        j = 0 # Right iterator
        k = 0 # List iterator

        # Merge
        while i < len(left) and j < len(right):
            if left[i] < right[j]:
                list_[k] = left[i]
                i += 1
            else:
                list_[k] = right[j]
                j += 1
            k += 1

        # Empty remaining values from left half
        while i < len(left):
            list_[k] = left[i]
            i += 1
            k += 1

        # Empty remaining values from right half
        while j < len(right):
            list_[k] = right[j]
            j += 1
            k += 1

def main():
    list_ = random.sample(range(101), 10)
    print("Unsorted:", list_)
    mergesort(list_)
    print("Sorted:  ", list_)


if __name__ == "__main__":
    main()

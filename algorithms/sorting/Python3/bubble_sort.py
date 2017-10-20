
import random


def bubble_sort_v1(uil):
    swapped = False
    while swapped:
        swapped = False
        for i in range(0, len(uil)-1):
            if uil[i+1] < uil[i]:
                uil[i], uil[i+1] = uil[i+1], uil[i]
                swapped = True
    return uil


if __name__ == "__main__":
    unsorted_integer_list = [random.randint(0, 101) for i in range(20)]
    sorted_integer_list = bubble_sort_v1(unsorted_integer_list[:])
    print("Unsorted: ", unsorted_integer_list)
    print("Sorted: ", sorted_integer_list);

package GFGDSA;

public class Searching {
    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target > arr[mid])
                low = mid + 1;
            else if (target < arr[mid])
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    //binary search implementation using recursion
    static int bSearch(int[] array, int start_index, int end_index, int element) {
        if (end_index >= start_index) {
            int middle = start_index + (end_index - start_index) / 2;
            if (array[middle] == element)
                return middle;
            if (array[middle] > element)
                return bSearch(array, start_index, middle - 1, element);
            return bSearch(array, middle + 1, end_index, element);
        }
        return -1;
    }

    //index of first occurrence in a sorted array
    static int firstOcc(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x)
                high = mid + 1;
            else if (arr[mid] < x)
                low = mid + 1;
            else {
                if (mid == 0 || (arr[mid - 1] != arr[mid]))
                    return mid;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    //index of last occurrence of an element in a sorted array
    static int lastOcc(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x)
                high = mid + 1;
            else if (arr[mid] < x)
                low = mid + 1;
            else {
                if ((mid == arr.length - 1) || (arr[mid + 1] != arr[mid]))
                    return mid;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }

    //count occurrences of an element in a sorted array
    static int countOcc(int[] arr, int x) {
        int first = firstOcc(arr, x);
        if (first == -1)
            return 0;
        else
            return (lastOcc(arr, x) - first + 1);
    }

    //count occurrences of an element in a sorted binary array
    static int countOnes(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == 0)
                low = mid + 1;
            else {
                if (mid == 0 || arr[mid - 1] == 0)
                    return (arr.length - mid);
                else
                    high = mid - 1;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,1,1,1};
        System.out.println(countOnes(arr));
    }
}

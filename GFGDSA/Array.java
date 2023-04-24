package GFGDSA;

import java.util.Arrays;

public class Array {
    // code for linear search algorithm
    static int linearSearch(int[] arr, int n, int x) {
        n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;

        }
        return -1;
    }

    // implementation for insertion at a given position
    static int insert(int[] arr, int n, int x, int cap, int pos) {
        if (n == cap)
            return n;
        int idx = pos - 1;
        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }
        arr[idx] = x;
        return n + 1;
    }

    // function to find the largest element in an array
    static int getLargest(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[res])
                res = i;
        }
        return res;
    }

    // efficient approach to find the 2nd largest element in an array(in one traversal)

    static int secondLargest(int[] arr, int n) {
        int res = -1, largest = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res])
                    res = i;

            }
        }
        return res;
    }

    static int delete(int[] arr, int n, int x) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x)
                break;
            if (i == n)
                return n;
            for (int j = i; j < n - 1; j++)
                arr[j] = arr[j + 1];
        }
        return n - 1;
    }

    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;

        }
        return true;
    }

    static void reverse(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;

        }
    }

    static int removeDups(int[] arr, int n) {
        n = arr.length;
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    static void moveZeroes(int[] arr) {//This is a function that moves all the zeroes in an integer array to the end of the array.
        int n = arr.length;
        int count = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count += 1;
            }

        }
    }

    static void leftRotate(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    // this function reverses an array in the given range
    static void reverse2(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    //function to left rotate an array by d positions
    static void leftRotateD(int[] arr, int D) {
        int n = arr.length;
        reverse2(arr, 0, D - 1);
        reverse2(arr, D, n - 1);
        reverse2(arr, 0, n - 1);
    }

    //function to find leader elements in an array
    static void leader(int[] arr) {
        int n = arr.length;
        int curr_ldr = arr[n - 1];
        System.out.print(curr_ldr + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (curr_ldr < arr[i]) {
                curr_ldr = arr[i];
                System.out.print(curr_ldr + " ");
            }

        }
    }

    //function to find maximum difference between 2 pairs
    static int maxDiff(int[] arr) {
        int res = arr[1] = arr[0], minVal = arr[0], n = arr.length;
        for (int j = 0; j < n; j++) {
            res = Math.max(res, arr[j] - minVal);
            minVal = Math.min(minVal, arr[j]);
        }
        return res;
    }

    //function to find frequencies of each element
    static void countFreq(int[] arr) {
        int n = arr.length, freq = 1, i = 1;
        while (i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i - 1] + " " + freq);
            i++;
            freq = 1;
        }
        if (n == 1 || arr[n - 1] != arr[n - 2])
            System.out.println(arr[n - 1] + " " + 1);
    }

    //stock buy and sell problem(Naive solution)
    static int maxProfit(int[] price, int start, int end) {
        if (end <= start)
            return 0;
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (price[j] > price[i]) {
                    int curr_profit = price[j] - price[i] + maxProfit(price, start, i - 1) + maxProfit(price, j + 1, end);
                    profit = Math.max(profit, curr_profit);
                }
            }
        }
        return profit;
    }

    //stock buy and sell problem(efficient solution)
    static int maxProfit(int[] price) {
        int n = price.length, profit = 0;
        for (int i = 1; i < n; i++) {
            if (price[i] > price[i - 1]) {
                profit += (price[i] - price[i - 1]);
            }

        }
        return profit;
    }//rainwater trapping problem efficient solution

    static int getWater(int[] arr) {
        int res = 0;
        int n = arr.length;
        int[] lMax = new int[n], rMax = new int[n];
        lMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(arr[i], lMax[i - 1]);
        }
        rMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(arr[i], rMax[i + 1]);
        }
        for (int i = 0; i < n - 1; i++) {
            res += (Math.min(lMax[i], rMax[i]) - arr[i]);
        }
        return res;

    }

    static int maxConsecutive1(int[] arr) {
        int n = arr.length;
        int res = 0, curr = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) curr = 0;
            else {
                curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }
    //maximum sum of subarray naive solution O(n^2)


    //maximum sum subarray problem efficient solution O(n)
    static int maxSum(int[] arr) {
        int n = arr.length;
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;

    }

    //maximum length of even-odd subarray
    static int evenOdd(int arr[]) {
        int n = arr.length;
        int res = 1;
        int curr = 1;
        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] != 0) || (arr[i] % 2 != 0 && arr[i - 1] == 0)) {
                curr += 1;
                res = Math.max(res, curr);
            } else curr = 1;
        }
        return res;
    }

    //maximum sum circular subarray
    public static int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0], minSum = nums[0], currMax = nums[0], currMin = nums[0], total = nums[0];

        // Compute the maximum sum subarray and minimum sum subarray of the array
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(currMax + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(currMin + nums[i], nums[i]);
            minSum = Math.min(minSum, currMin);

            total += nums[i];
        }

        // If all the numbers are negative, then the maximum sum subarray is the largest negative number
        if (maxSum < 0) {
            return maxSum;
        }

        // The maximum sum subarray that wraps around the array is the difference between the total sum and the minimum sum subarray
        return Math.max(maxSum, total - minSum);
    }

    static int majorityElement(int arr[]) {
        int n = arr.length;
        int res = 0, count = 1;
        for (int i = 1; i < n; i++) { //to check if an element is a candidate for majority
            if (arr[res] == arr[i])
                count++;
            else
                count--;
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) { // to check if the element is actually a majority
            if (arr[res] == arr[i])
                count++;
        }
        if (count <= n / 2)
            res = -1;
        return res;
    }

    //brute force solution to minimum flips problem
    static void flip(int arr[]) {
        int n = arr.length;
        int count1 = 0, count0 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count0 += 1;
            else
                count1 += 1;
        }
        if (count1 >= count0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0)
                    arr[i] = 1;

            }
        } else {
            for (int i = 0; i < n; i++) {
                if (arr[i] == 1)
                    arr[i] = 0;

            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void printGroups(int arr[], int n) {

        // Traverse through all array elements
        // starting from the second element
        for (int i = 1; i < n; i++) {

            // If current element is not same
            // as previous
            if (arr[i] != arr[i - 1]) {

                // If it is same as first element
                // then it is starting of the interval
                // to be flipped.
                if (arr[i] != arr[0])
                    System.out.print("From " + i + " to ");

                    // If it is not same as previous
                    // and same as first element, then
                    // previous element is end of interval
                else
                    System.out.println(i - 1);
            }
        }

        // Explicitly handling the end of
        // last interval
        if (arr[n - 1] != arr[0])
            System.out.println(n - 1);
    }

    //window sliding technique
    static int maxKSum(int arr[], int k) {
        int n = arr.length, curr_sum = 0;
        for (int i = 0; i < k; i++) {
            curr_sum += arr[i];
        }
        int max_sum = curr_sum;
        for (int i = k; i < n; i++) {
            curr_sum += (arr[i] - arr[i - k]);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;

    }

    //variation problem
    static boolean isSubsum(int arr[], int sum) {
        int curr_sum = arr[0], s = 0, n = arr.length;
        for (int e = 1; e < n; e++) {
            while ((curr_sum > sum) && (s < e - 1)) {
                curr_sum -= arr[s];
                s++;
            }
            if (curr_sum == sum)
                return true;
            if (e < n)
                curr_sum += arr[e];
        }
        return (curr_sum == sum);
    }

    //prefix sum technique
    static int prefixSum(int arr[], int l, int r) {
        int n = arr.length;
        int prefix_sum[] = new int[n];
        prefix_sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i];
        }
        if (l != 0)
            return prefix_sum[r] - prefix_sum[l - 1];
        else
            return prefix_sum[r];

    }

    //equilibrium point problem
    static boolean isEqPoint(int arr[]) {
        int n = arr.length, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int l_sum = 0;
        for (int i = 0; i < n; i++) {
            if (l_sum == sum - arr[i])
                return true;
            l_sum += arr[i];
            sum -= arr[i];

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {20, 5, 7, 25};
        int[] arr2 = new int[5];
        int[] arr3 = {2, 3, 4, 5, 6, 8};
        int[] arr4 = {4,2,2};
        arr2[0] = 5;
        arr2[1] = 10;
        arr2[2] = 20;
        /*
         * System.out.println(linearSearch(arr, 4, 25));
         * System.out.println(insert(arr2, 3, 7, 5, 2));
         * System.out.println(java.util.Arrays.toString(arr2));
         * System.out.println(getLargest(arr));
         * System.out.println(secondLargest(arr, 4));
         * System.out.println(isSorted(arr3));
         * System.out.println(isSorted(arr));
         * reverse(arr);
         */
        // moveZeroes(arr4);
        //countFreq(arr4);
        System.out.println(isEqPoint(arr4));
    }

}

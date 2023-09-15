class Solution
{

    public static int find_median(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 == 1) {
            // If the number of elements is odd, return the middle element
            return arr[n / 2];
        } else {
            // If the number of elements is even, return the average of the two middle elements
            int middle1 = arr[(n - 1) / 2];
            int middle2 = arr[n / 2];
            return (middle1 + middle2) / 2;
        }
    }
}
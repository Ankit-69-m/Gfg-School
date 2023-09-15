class Solution
{

    public static int find_median(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            int middle1 = arr[(n - 1) / 2];
            int middle2 = arr[n / 2];
            return (middle1 + middle2) / 2;
        }
    }
}

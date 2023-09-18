class Compute {
    public long countOfElements(long arr[], long N, long x) {
        long left = 0;
        long right = N - 1;
        long result = -1; 

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (arr[(int) mid] <= x) {
                result = mid; 
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return result + 1;
    }
}
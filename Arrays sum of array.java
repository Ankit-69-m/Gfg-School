class Solution {
    
    public long getSum(long A[], long N)
    {
        long sum = 0; 
        
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        
        return sum;
    }

    }
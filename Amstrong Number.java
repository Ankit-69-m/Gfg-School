class Solution {
    static String armstrongNumber(int n){
        int originalNumber = n;
        int digit1 = n % 10;
        n /= 10;
        int digit2 = n % 10;
        n /= 10;
        int digit3 = n % 10;

        int sumOfCubes = (int) (Math.pow(digit1, 3) + Math.pow(digit2, 3) + Math.pow(digit3, 3));

        if (sumOfCubes == originalNumber) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
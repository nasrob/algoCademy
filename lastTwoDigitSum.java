class Solution {

    /*
     * Given a non-negative integer n with at least two digits, compute and return the sum of the last two digits
     */
    public int lastTwoDigitSum(int n) {

        int lastTwoDigits = n % 100;
        int lastDigit = n % 10; // or lastTwoDigits % 10
        int secondLastDigit = lastTwoDigits / 10;
        return lastDigit + secondLastDigit;
    }
}

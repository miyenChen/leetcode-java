public class e3370 {
    public static int smallestNumber(int n) {
        String binary = Integer.toBinaryString(n);
        int res = 0;
        for (int i = 0; i < binary.length(); i++) {
            int num = (int) Math.pow(2, i);
            res += num;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(smallestNumber(10));
    }
}
/*
100501. Smallest Number With All Set Bits
User Accepted:11269
User Tried:11525
Total Accepted:11793
Total Submissions:15504
Difficulty:Easy

You are given a positive number n.
Return the smallest number x greater than or equal to n, such that the binary representation of x contains only set bits.
A set bit refers to a bit in the binary representation of a number that has a value of 1.

Example 1:
Input: n = 5
Output: 7
Explanation:
The binary representation of 7 is "111".

Example 2:
Input: n = 10
Output: 15
Explanation:
The binary representation of 15 is "1111".

Example 3:
Input: n = 3
Output: 3
Explanation:
The binary representation of 3 is "11".

- 返回的值二進位必須全部都是 1，例如 11,111,1111
- 返回值需要比輸入值大
*/
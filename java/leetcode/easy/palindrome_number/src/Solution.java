class Solution {
    public boolean isPalindrome(int x) {
        boolean result=false;
        int initial_value=x;

        if (x<0) return result;

        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) break;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) break;
            rev = rev * 10 + pop;
        }

        if (rev==initial_value) result=true;

        return result;
    }
}
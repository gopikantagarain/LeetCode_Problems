class Solution {
    public int reverse(int x) {
        long ans = 0 , x1 = x;
        while(x1 != 0){
            ans = ans * 10 + x1 % 10;
            x1 /= 10;
            if(ans > Integer.MAX_VALUE) return 0;
            if(ans < Integer.MIN_VALUE) return 0;
        }
        return (int) ans;
    }
}
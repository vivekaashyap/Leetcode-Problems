class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            x = 1/x;
            n = -n;
        }
        return power(x, n);
    }
    public double power(double x, long n){
        if(n == 0) return 1;
        double half = power(x, n/2);
        double pow = half * half;
        if(n % 2 != 0){
            pow = x * pow;
        }
        return pow;
    }
}
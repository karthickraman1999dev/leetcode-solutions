class Solution {
    public int countPrimes(int n) {

        if (n < 2) {
            return 0;
        }

        boolean prime [] = new boolean [n + 1];

        for (int i = 2; i < n;++i) {
            prime[i] = true;
        }

        for (int p = 2; p * p < n;++p) {
            if (prime[p]) {

                for (int multiple = p * p; multiple < n; multiple += p) {

                    prime[multiple] = false;
                }
            }
        }

        int cntprime = 0;

        for (int j = 2; j < n;++j) {
            if (prime[j]) {
                cntprime++;
            }
        }
        return cntprime;
        
    }
}
class Solution {
    public int countPrimes(int n) {

        if (n < 2) {
            return 0;
        }

        boolean prime[] = new boolean[n + 1];

        for (int i = 2; i < n; i += 1) {
            prime[i] = true;
        }

        for (int i = 2; i * i < n; i += 1) {
            if (prime[i]) {
                for (int multiple = i * i; multiple < n; multiple += i) {
                    prime[multiple] = false;
                }
            }
        }
        int primecnt = 0;
        for (int i = 2; i < n; i+= 1) {
            if(prime[i]) {
                primecnt++;
            }
        }
        return primecnt;
        
        // TC = O(n log log n);
        // sc = o(n);
    }
}

        

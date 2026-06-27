class Solution {
    public String longestCommonPrefix(String[] strs) {

        String first = strs[0];

        for (int i = 0; i <= first.length()-1;++i) {
            char ch1 = first.charAt(i);

            for (int j = 1; j <= strs.length-1;++j) {
                
                String second = strs[j];

                if (i >= second.length()) {
                    return first.substring(0,i);
                }

                char ch2 = second.charAt(i);

                if (ch1 == ch2) {
                    continue;
                } else {
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
}
    
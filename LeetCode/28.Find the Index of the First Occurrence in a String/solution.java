class Solution {
    public int strStr(String haystack, String needle) {
            int i=0;
            int j=0;
            int k = 0;
            while(i<haystack.length()){
                k=i;
                while(i<haystack.length() &&  j<needle.length() && haystack.charAt(i)==needle.charAt(j)){
                    i++;
                    j++;
                }
                if(j==needle.length()){
                    return k;
                }
                i = k + 1;
                j=0;
            }
        return -1;
    }
}

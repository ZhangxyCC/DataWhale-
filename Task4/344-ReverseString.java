class Solution {
    public String reverseString(String s) {
        int len = s.length();
        char[] res = new char[len];
        for(int i=0;i<len;i++){
            res[i] = s.charAt(len-i-1);
        }
        return new String(res);
    }
}
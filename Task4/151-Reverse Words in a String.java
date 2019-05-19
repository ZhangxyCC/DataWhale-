class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        StringBuilder res = new StringBuilder();
        int end = chars.length - 1;
        int begin = 0;
        while(end >= 0){
            if(chars[end] == ' ')  end--;
            else{
                begin = end - 1;
                while(begin >= 0 && chars[begin] != ' '){
                    begin--;
                }
                res.append(s.substring(begin + 1, end + 1));
                res.append(' ');
                end = begin - 1;
            }
        }
        if(res.length() > 1)    res = res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}
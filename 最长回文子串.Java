#solution1(暴力解法)
class Solution {
    public String longestPalindrome(String s) {
        int index = 0;
        ArrayList<String> palin = new ArrayList<>();
        int r_bor = s.length();
        for (int i = 0; i < r_bor; i++) {
            int left = i;
            int right = i;
            while(left>=0&&right<r_bor){
                if(s.charAt(left)==s.charAt(right)){
                    palin.add(s.substring(left,right+1));
                }else {
                    break;
                }
                left--;
                right++;
            }
            left = i;
            right = i+1;
            while(left>=0&&right<r_bor){
                if(s.charAt(left)==s.charAt(right)){
                    palin.add(s.substring(left,right+1));
                }else {
                    break;
                }
                left--;
                right++;
            }
        }
        int size = 0;
        for (String ss:
             palin) {
            if(ss.length()>size){
                size = ss.length();
            }
        }
        for (String sss:
                palin) {
            if(sss.length()==size){
                return sss;
            }
        }
        return null;
    }
}

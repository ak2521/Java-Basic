class Solution {
    public int lengthOfLastWord(String s) {
        String strarr[]=s.split(" ");
        return strarr[strarr.length-1].length();
    }
}
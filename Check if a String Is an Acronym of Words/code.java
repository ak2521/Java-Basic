class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String che="";
        for(String str:words)
        {
            che+=str.charAt(0);
        }
        return s.equals(che);
    }
}
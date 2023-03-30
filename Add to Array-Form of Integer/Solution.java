
import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String str=Arrays.toString(num);
        str=str.replaceAll(",","");
        str=str.replaceAll(" ","");
        str=str.replace("[","");
        str=str.replace("]","");
        BigInteger num1=new BigInteger(str);
        BigInteger num2=new BigInteger(String.valueOf(k));
        str=String.valueOf(num1.add(num2));
        List<Integer>lt =new ArrayList<Integer>();
        //System.out.println(str);
        for(int i=0;i<str.length();i++)
        {
            int y=str.charAt(i)-'0';
            lt.add(y);
        }
        return lt;
    }
}

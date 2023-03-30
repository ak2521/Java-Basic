import java.lang.*;
import java.math.BigInteger;
import java.util.*;
class Solution {
    public String addStrings(String num1, String num2) {
     BigInteger x = new BigInteger(num1);
     BigInteger y = new BigInteger(num2);
     return String.valueOf(x.add(y));
    }
}

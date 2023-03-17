import java.util.*;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
       String str="";
        for(int i:binary)
          {
          str=str+String.valueOf(i);
        }
        int decimal=Integer.parseInt(str,2);
        return decimal;
    }
}

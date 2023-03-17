#Another Way
import java.math.BigInteger;
public class Prime {
    public static boolean isPrime(int num) {
        if (num < 2) { return false; }
        BigInteger result = BigInteger.valueOf(num);
        return result.isProbablePrime((int)Math.log(num));
    }
}

<img width="1440" alt="Result" src="https://user-images.githubusercontent.com/105222251/225932441-a76ec125-b08f-4e03-9363-0d9d87c3e1f8.png">


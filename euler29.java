import java.math.BigInteger;
import java.util.HashSet;

public class euler29 {
    public static void main(String[] args) {
        HashSet<BigInteger> hs = new HashSet<BigInteger>();
        BigInteger a=BigInteger.ZERO, b=BigInteger.ZERO;
        int total = 0;
        BigInteger power = BigInteger.ZERO;
        for(a = BigInteger.valueOf(2); a.compareTo(BigInteger.valueOf(101)) < 0; a = a.add(BigInteger.ONE))
        {
            for(b = BigInteger.valueOf(2); b.compareTo(BigInteger.valueOf(101)) < 0; b = b.add(BigInteger.ONE))
            {
                power = a.pow(Integer.parseInt(b.toString()));
                if(!hs.contains(power))
                {
                    total++;
                    hs.add(power);
                    // System.out.println(power);
                }
            }
        }
        System.out.println(total);
    }
}

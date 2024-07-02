import java.math.BigInteger;

public class euler25 {
    public static void main(String[] args) {
        BigInteger f1 = BigInteger.ONE; 
        BigInteger f2 = BigInteger.ONE;
        BigInteger fn = BigInteger.ZERO;
        int n = 2;
        String s = "";
        while(true)
        {
            fn = f1.add(f2);
            n++;
            s = fn + "";
            f1 = f2;
            f2 = fn;
            if(s.length() == 1000)
            break;
        }
        System.out.println(n);
    }
}

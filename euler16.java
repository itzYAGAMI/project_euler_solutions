import java.math.BigInteger;

public class euler16 {
    public static void main(String[] args) {
        BigInteger base = BigInteger.valueOf(2);
        BigInteger product = base.pow(1000);

        String s = product + "";
        long sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            sum = sum + Integer.parseInt(s.charAt(i)+"");
        }
        System.out.println(sum);
    }
}

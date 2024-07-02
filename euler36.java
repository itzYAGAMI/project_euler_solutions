public class euler36 {
    // public static boolean isPalindrome(long n){
    //     long rev = 0, no = n;
    //     while(no != 0)
    //     {
    //         rev = (rev * 10) + (no % 10);
    //         no /= 10;
    //     }
    //     return (rev == n);
    // }
    public static boolean isPalindrome(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}
    public static void main(String[] args) {
        long dec, sum = 0;
        String bin;
        for(dec = 1; dec <= 1000000; dec++){
            bin = Long.toBinaryString(dec);
            if( isPalindrome(bin) && isPalindrome(Long.toString(dec)))
                sum += dec;
        }
        System.out.println(sum);
    }
}
// import java.math.Biglongeger;
// 
// public class euler36 {
//     public static boolean isPalindrome(Biglongeger n){
//         Biglongeger rev = Biglongeger.ZERO, no = n;
//         while(!no.equals(Biglongeger.ZERO))
//         {
//             rev = (rev.multiply(Biglongeger.TEN)).add(no.mod(Biglongeger.TEN)); 
//             // rev = (rev * 10) + (no % 10);
//             no = no.divide(Biglongeger.TEN);
//         }
//         return (rev.equals(n));
//     }
//     public static void main(String[] args) {
//         Biglongeger dec, bin, sum = 0;
//         for(dec = Biglongeger.ONE; !dec.equals(Biglongeger.valueOf(1000000)); dec = dec.add(Biglongeger.ONE)){
//             bin = longeger.parselong(Biglongeger.toBinaryString(dec));
//             if( isPalindrome(bin) && isPalindrome(dec))
//                 sum += dec;
//         }
//         System.out.prlongln(sum);
//     }
// }

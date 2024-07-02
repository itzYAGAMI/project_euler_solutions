public class euler21 {

    public static long factorsSum(long n){
        long count = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0) {
                count += i;
                if (i != 1 && i != n/i) {
                    count += n/i;
                }
            }
        }
        if(count == n) return 0;
        return count;
    }
    public static void main(String[] args) {
        // String amicable = "";
        long sum = 0;
        long n = 0;
        // int foundnot;
        // int foundnot2;
        for(int i = 1;i <= 10000; i++){
            n = factorsSum(i);
            if(i == factorsSum(n))
            {
                // foundnot = amicable.indexOf(i);
                // foundnot2 = amicable.indexOf(n+"");
                // if(foundnot != -1 || foundnot2 != -1)
                //     break;
                // else    
                //     amicable += (" "+i+" "+" "+n);
                sum += i;
                System.out.println(i + "    " +n);
            }
            
        }
        System.out.println(sum);
    }
}

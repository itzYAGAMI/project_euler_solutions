public class euler50 {
    public static void main(String[] args) {
        long sum = 0;
        int i = 3;
        sum=2;
        do{
            
            if(isPrime(i)) sum += i;
            else i+=2;
        }while(sum < 1000000);
        System.out.println(sum);
    }
    static boolean isPrime(int n)
    {
        if (n < 2) return false;
        if (n % 2 == 0) return (n == 2);
        int root = (int)Math.sqrt((double)n);
        for (int i = 3; i <= root; i += 2)
        {
            if (n % i == 0) return false;
        }
        return true;
    }
}

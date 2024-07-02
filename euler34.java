public class euler34 {
    static int factorial(long n)
    {
        int f = 1;
        for(int i = 1; i <= n;i++)
        f*=i;
        return f;
    }
    public static void main(String[] args) {
        int fact[] = new int[10];
        
        for(int i = 0; i <= 9; i++){
            fact[i] = factorial(i);
            // System.out.println(fact[i]);
        }

        long no, d, temp = 0, sum = 0;
        for(long i = 10;i <= 9999999; i++)
        {
            no = i;
            temp = 0;
            while(no != 0)
            {
                d = no % 10;
                temp += fact[(int)d];
                no /= 10;
            }
            if(temp == i)
            sum += i;
        }
        System.out.print(sum);
    }
}

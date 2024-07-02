public class eueler30 {
    public static int digitFifth(int n)
    {
        int sum = 0;
        int no = n;
        while(no != 0)
        {
            int d = no % 10;
            no /= 10;
            sum += d*d*d*d*d;
        }
        return sum;
    }
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        int sum = 0;
        for(int i = 2;i <= 200000; i++)
        {
            if( i == digitFifth(i))
                sum += i;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end-starttime + "ms");
    }
}

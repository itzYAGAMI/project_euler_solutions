import java.util.HashMap;
public class euler17 {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        HashMap<String, String> hm = new HashMap<String, String>();
        String total = "";
        hm.put("1", "one");
        hm.put("2", "two");
        hm.put("3", "three");
        hm.put("4", "four");
        hm.put("5", "five");
        hm.put("6", "six");
        hm.put("7", "seven");
        hm.put("8", "eight");
        hm.put("9", "nine");
        hm.put("10", "ten");
        hm.put("11", "eleven");
        hm.put("12", "twelve");
        hm.put("13", "thirteen");
        hm.put("14", "fourteen");
        hm.put("15", "fifteen");
        hm.put("16", "sixteen");
        hm.put("17", "seventeen");
        hm.put("18", "eighteen");
        hm.put("19", "nineteen");
        hm.put("20", "twenty");
        hm.put("30", "thirty");
        hm.put("40", "forty");
        hm.put("50", "fifty");
        hm.put("60", "sixty");
        hm.put("70", "seventy");
        hm.put("80", "eighty");
        hm.put("90", "ninety");
        hm.put("100", "hundredand");
        hm.put("1000", "onethousand");
        String[] arr;
        int j, l, power, d, temp2;
        for(int i = 1; i <= 1000; i++)
        {
            if(i == 100)
            {
                total = total + "onehundred";
                continue;
            }
            if(hm.containsKey((i+"")))
            {
                total = total + hm.get((i+""));
                continue;
            }
            arr = (""+i).split("", 0);
            l = arr.length;
            inner: 
            for(j = 0; j < l; j++)
            {
                power = (int)Math.pow(10, l-1-j);
                d = Integer.parseInt(arr[j]);
                if(l == 3 && j == 0)
                {
                    if(hm.containsKey(""+d))
                    {
                        total = total + hm.get(""+d);
                    }
                    if(i % 100 == 0)
                    {
                        total = total + "hundred";
                    }
                    else if(hm.containsKey(""+power))
                    {
                        total = total + hm.get(""+power);
                    }
                }
                if((l == 2 && j == 0) || (l == 3 && j == 1))
                {
                    temp2 = (Integer.parseInt(arr[j])) * 10 + Integer.parseInt(arr[j+1]);
                    if(hm.containsKey(""+temp2))
                    {
                        total = total + hm.get(""+temp2);
                        j=l;
                        continue inner;
                    }
                }
                if((l == 3 && j != 0) || (l == 2))
                {
                    temp2 = power * d;
                    if(hm.containsKey(""+temp2))
                    {
                        total = total + hm.get(""+temp2);
                    }
                }
            }
        }
        System.out.println(total);
        System.out.println(total.length());
        long end = System.currentTimeMillis();
        System.out.println(end-starttime + "ms");
    }
}

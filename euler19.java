public class euler19 {
    // public static int noOfDays(int n){
    //     int days;
    //     switch(n)
    //     {
    //         case 1:
    //         case 3:
    //         case 5:
    //         case 7:
    //         case 8:
    //         case 10:
    //         case 12:
    //         days = 31; break;
    //         case 2: days = 28; break;
    //         default: days = 30;break;
    //     }
    //     return days;
    // }
    // public boolean isSunday()
    // {
    //     return true;
    // }
    public static void main(String[] args) {
        int foryear[] = {0,3,3,6,1,4,6,2,5,0,3,5};
        int sundays = -1;
        int day = 1;
        int temp;
        for(int year = 1901; year <= 2000; year++)
        {
            for(int month = 1; month <= 12; month++)
            {
                temp = (year%100) + (year/4) + day + foryear[month-1];
                temp = temp % 7;
                if(isLeap(year))
                temp--;
                if(temp == 0)
                sundays++;
            }
            System.out.println(sundays);
        }
    }
    public static boolean isLeap(int n){
        if(n % 4 == 0){
            if(n % 100 == 0)
            return false;
            else if(n % 400 == 0)
            return true;
        }
        else
        return false;
        return false;
    }
        // System.out.println(sundays);
        // for(int j = 1; j <= 12; j++)
        // {
        //     daycounter = noOfDays(j);
        //     System.out.println(daycounter);
        // }
    
}


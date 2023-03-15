class Solution {
    public int dayOfYear(String dates) {
    int[] dayofm={31,28,31,30,31,30,31,31,30,31,30,31};
    int days=0;
    int month=Integer.parseInt(dates.substring(5,7));
    int day=Integer.parseInt(dates.substring(8,dates.length()));
    int year=Integer.parseInt(dates.substring(0,4));
    if(month==1)
    {
        return day;
    }
    else
    {
        if((((year % 4 == 0) && (year % 100!= 0))  || (year%400 == 0) ) && month>2)
        {
            days=days+1;
        }
        for(int i=0;i<month-1;i++)
        {
            days=days+dayofm[i];
        }
        System.out.println(days);
        days=days+day;
    }
    return days;
    }
}

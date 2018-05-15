//计算某年某月有多少天
public class DayCounter {
    public static void main(String[] arguments){
        int yearIn=2012;
        int mouthIn=1;
        if(arguments.length>0)
            mouthIn=Integer.parseInt(arguments[0]);
        if(arguments.length>1)
            yearIn=Integer.parseInt(arguments[1]);
        System.out.println(mouthIn+"/"+yearIn+" has "+countDays(mouthIn,yearIn)+" days.");
    }

    static int countDays(int mouth,int year){
        int count=1;
        switch (mouth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count=30;
                break;
            case 2:
                if(year%4==0)
                    count=29;
                else
                    count=28;
                if(year%100==0&year%400!=0)
                    count=28;
        }
        return count;
    }
}

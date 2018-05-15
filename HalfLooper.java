public class HalfLooper {
    public static void main(String[] argrments){
        int[] denver={1900900,1700700,1700700};
        int[] philadelphia=new int[denver.length];
        int[] total=new int[denver.length];//3个实例变量
        int sum=0;

        philadelphia[0]=1900900;
        philadelphia[1]=1800000;
        philadelphia[2]=1750000;

        for (int i=0;i<denver.length;i++){
            total[i]=denver[i]+philadelphia[i];
            System.out.format((i+2009)+" production: %,d%n",total[i]);
            sum+=total[i];
        }

        System.out.format("Average production: %,d%n",(sum/denver.length));
    }
}
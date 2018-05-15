//数组初始化，修改数组元素
public class HalfDollors {
    public static void main(String[] argrments){
        int[] denver={1900900,1700700,1700700};
        int[] philadelphia=new int[denver.length];
        int[] total=new int[denver.length];//3个实例变量
        int average;

        philadelphia[0]=1900900;
        philadelphia[1]=1800000;
        philadelphia[2]=1750000;

        total[0]=denver[0]+philadelphia[0];
        total[1]=denver[1]+philadelphia[1];
        total[2]=denver[2]+philadelphia[2];
        average=(total[0]+total[1]+total[2])/3;

        System.out.println("2009 prpduction: ");
        System.out.format("%,d%n",+total[0]);
        System.out.println("2010 production: ");
        System.out.format("%,d%n",+total[1]);
        System.out.println("2011 production: ");
        System.out.format("%,d%n",+total[2]);
        System.out.println("Average production: ");
        System.out.format("%,d%n",+average);
    }
}

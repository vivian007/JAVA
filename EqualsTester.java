//比较对象

public class EqualsTester {
    public static void main(String[] arguments){
        String str1,str2;
        str1="Free the bound periodicals.";
        str2=str1;

        System.out.println("String1: "+str1);
        System.out.println("String2: "+str2);
        System.out.println("Same object? "+(str1==str2)+"\n");
        //使用==或！=判断运算符两边是否引用的同一个对象

        str2=new String(str1);
        System.out.println("String1: "+str1);
        System.out.println("String2: "+str2);
        System.out.println("Same object? "+(str1==str2));
        System.out.println("Same value? "+str1.equals(str2));
        //使用equals()方法比较字符串中每个字符，如果两个字符串中值相同，返回ture
    }
}

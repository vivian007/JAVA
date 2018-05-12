//类方法适用于整个类，而不是某个实例。
public class ClassMethod {
    public static void main(String[] arguments){
        int firstPrice=225;
        int scenodPrice=217;
        int higherPrice=Math.max(firstPrice,scenodPrice);//调用了java.lang包中的类Math,使用了类方法Math.max()
        System.out.println("The higherPrice is: "+higherPrice);
        String s,s2;
        s="item";
        s2=s.valueOf(550);//句点表示法，左边是类实例或类本身
        s2=String.valueOf(550);//使用类名是代码阅读性更强
        //String.valueOF()方法返回一个String实例，包含参数的字符串值
        System.out.println("The string 's' is: "+s);
        System.out.println("The string 's2' is: "+s2);
}
}

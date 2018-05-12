//调用String类的一些方法，String包含字符串检测和修改
public class StringChecker {
    public static void main(String[] arguments){
        String str="would you like an apple pie with that?";//创建一个String实例
        System.out.println("Length of this string:"+str.length());//打印字符串的值
        System.out.println("The character at position 6"+str.charAt(6));//调用charAt()方法，返回字符串中给定位置字符
        System.out.println("The subsubstring from 26 to 32:"+str.substring(26,32));
        //调用substring()方法，返回指定范围内的字符串
        System.out.println("The index of the first 'a':"+str.indexOf('a'));//调用indexOf()方法，返回给定字符(a)第一次出现的位置
        System.out.println("The index of the beginning of the"+"substring\"apple\":"+str.indexOf("apple"));
        //调用indexOf()方法，返回字符串"apple"起始位置
        System.out.println("The string in uppercase:"+str.toUpperCase());//调用toUpperCase方法使字符串全部大写
    }
}

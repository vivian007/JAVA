//嵌套调用方法：如果方法返回一个对象，可以在同一条语句中调用该对象的方法
public class NestedMethodCalls {
    public static void main(String[] arguments){
        String laber="From";
        System.out.println("The string is: "+laber);
        String upper=laber.toUpperCase();//upper对象存储了调用laber.toUpperCase()的值
        System.out.println("The string in uppercase: "+upper);
    }
}

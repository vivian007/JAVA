//使用System.out.format()对输出格式进行控制，格式字符串以%打头，后跟一个或多个标志
// "%,d"显示十进制数，每三位用逗号分离
//"%n"表示换行符
public class StringFormat {
    public static void main(String[] arguments){
        int accountBalance=5005;
        System.out.format("Balance:$%,d%n",accountBalance);//控制美元金额显示
        double pi=Math.PI;
        System.out.format("%.11f%n",pi);//显示pi的值，包含11位小数
    }
}

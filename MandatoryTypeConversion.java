//强制类型转换

public class MandatoryTypeConversion {
    public static void main(String[] arguments){
        //强制转换基本类型
        float x=5,y=3;
        float result=x/y;
        int result2=(int)(x/y);//强制转换为整数型
        //强制转换优先级高于算术运算，必须使用圆括弧
        System.out.println("result is: "+result);
        System.out.println("Integer result is: "+result2);

        //强制转换对象：源类、目标类之间存在继承关系
        //Employee emp=new Employee();
        //VicePresident veep=new VicePresident();
        //emp= (Employee) veep;//veer实例强制转换为emp实例，分属两个不同的方法

        //基本类型和对象之间的转换
        Integer dataCount=new Integer(7801);
        int newCount=dataCount.intValue();
        System.out.println("The newCount is: "+newCount);
        String pennsylvania="65000";
        int peen=Integer.parseInt(pennsylvania);
        System.out.println("The peen is: "+peen);
        Float f1=new Float(12.5F);
        Float f2=new Float(27.2F);
        System.out.println("Lower number: "+Math.min(f1,f2));
    }
}


//定义类变量
//类变量:静态变量，适用于类及所有实例，修改值将影响所有实例
public class StringStatic {
    public static void main(String[] arguments){
        FamliyMember dad=new FamliyMember();
        System.out.println("Famliy's surname is:"+dad.surname);//不推荐这样写！！！
        System.out.println("Famliy's surname is:"+FamliyMember.surname);
        //引用类变量时应使用类名，有利于提高代码的可读性
    }
}
class FamliyMember {
    static String surname = "Mendoza";
    //static不能放在内部类中，它不需要实例就可初始化，内部类是必须依靠外部类实例进行初始化
    String name;
    int age;
}
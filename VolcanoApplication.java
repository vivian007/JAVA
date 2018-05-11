class VolcanoApplication{
    public static void main(String[] arguments){ //创建并命名main方法
        VolcanoRobot dante=new VolcanoRobot(); //使用VolcanRobot为模板创建了一个新的VolcanRobot对象
        dante.status="exploring";
        dante.speed=2;
        dante.temperature=510; //给对象dante的实例变量赋值

        dante.showAttributes(); //调用了dante对象的showAttributes()方法
        System.out.println("Increasing speed to 3.");
        dante.speed=3;
        dante.showAttributes();
        System.out.println("Changing temperature to 670.");
        dante.temperature=670;
        dante.showAttributes();
        System.out.println("Checking the temperature.");
        dante.checkTemperature(); //调用了dante对象的checkTemperature()方法
        dante.showAttributes();
    }
}

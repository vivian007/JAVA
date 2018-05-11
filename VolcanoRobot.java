class VolcanoRobot{
    String status; //存储一个String对象
    int speed; //存储一个int对象
    float temperature; //存储一个float对象

    void checkTemperature(){
        if(temperature>600){
            status="returning home";
            speed=5;
        }
    } //第一个实例方法，对象可调用该实例方法

    void showAttributes(){
        System.out.println("Status:"+status);
        System.out.println("Speed:"+speed);
        System.out.println("Temperature:"+temperature);
    } //该方法使用System.out.println()来显示3个实例变量的的值
}
//对象的引用：引用是一个地址，不同于c语言的显式指针，这里引用指明了对象的变量和方法的存储位置。
import java.awt.Point;
public class RefTester {
    public static void main(String[] arguments){
        Point pt1,pt2;
        pt1=new Point(100,100);
        pt2=pt1;//pt2引用pt1

        pt1.x=200;
        pt1.y=200;
        System.out.println("Point1: "+pt1.x+","+pt1.y);
        System.out.println("Point2: "+pt2.x+","+pt2.y);
    }
}

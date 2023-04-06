import java.util.*;
class Rectangle {
    float a;
    float b;

    void area(float a, float b) {
        float area = a * b;
        System.out.println(area);
    }

    void perimeter(float a, float b) {
        float per = 2 * (a + b);
        System.out.println(per);
    }
}
public class Squre {
    float a;
    void area(float a){
        float area=a*a;
        System.out.println(area);
    }
    void perimeter(float a){
        float per=4*a;
        System.out.println(per);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float side1=sc.nextFloat();
        float side2=sc.nextFloat();

        Squre s=new Squre();
        s.a=side1;
        s.area(side1);
        s.perimeter(side1);
        Rectangle s1=new Rectangle();
        s1.a=side1;
        s1.b=side2;
        s1.area(side1,side2);
        s1.perimeter(side1,side2);


    }
}
// Create a class Square with a method to initialize its side, calculating area, perimeter etc.
//Create a class Rectangle & problem 3.
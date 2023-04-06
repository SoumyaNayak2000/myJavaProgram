import java.util.Scanner;

public class simpleCalculator {
    public static void calculator(double a,double b){
        double sum=a+b;
        double sub=a-b;
        double mul=a*b;
        double div=a/b;
        double modulos=a%b;
       System.out.println("the sum of a & b is " + sum);
        System.out.println("the substraction of a & b is " + sub);
        System.out.println("the multiplication of a & b is " + mul);
        System.out.println("the division of a & b is " + div);
        System.out.println("the remainder / modulos of a & b is " + modulos);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        calculator(a,b);
    }

}

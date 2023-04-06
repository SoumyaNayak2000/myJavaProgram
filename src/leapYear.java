import java.util.*;
public class leapYear {
    public static void leap(int n){
        if(((n%4==0) && (n%100 !=0)) || (n%400==0)) {
            System.out.println("Yes");
        }
        else{
                System.out.println("No");
            }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        leap(n);
    }
}
//    Given a year(an integer variable) as input, find if it is a leap year or not.
//        Note: Leap year is the year that is multiple of 4.But, multiples of 100 which are not multiples of 400 are not leap years.

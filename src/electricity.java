import java.util.*;
public class electricity {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        double bill =0;
        if(N <=50){
            bill= N*0.50;
            System.out.println(bill);
        }
        else if(N>50 && N<=150){
            bill=bill+50*0.50+(N-50)*0.75;
            System.out.println(bill);
        }
        else if(N>150 && N<=250){
            bill=bill+50*0.50+100*0.75+(N-150)*1.25;
            System.out.println(bill);
        }
        else if(N>250){
            bill=bill+50*0.50+100*0.50+100*1.25 +(N-250)*1.50;
           System.out.println(bill);
        }
    }
}

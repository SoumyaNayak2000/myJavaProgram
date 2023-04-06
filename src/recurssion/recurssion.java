package recurssion;

import java.util.Scanner;

public class recurssion {
    //iterative
    public static void printNto1iterative(int n){
        for(int i=n;i>0;i--){
            System.out.println(i);
        }
    }
    //recurssive
    public static void printNto1recurssive(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printNto1recurssive(n-1);
    }
    //iterative
    public static void printSumOf1stN_Naturalnumbers(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;

        }
        System.out.println(sum);
    }
    //recurssive
    public static void printSumOf1stN_Naturalnumbersrecurssive(int n,int sum,int i){
        if(i==n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSumOf1stN_Naturalnumbersrecurssive(n,sum,i+1);
    }
    public static int calcfactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int factOfnm1 =calcfactorial(n-1);
        int fact=n*factOfnm1;
        return fact;
    }
    //fibonacci series
//    public static void fibonacciseriesrecurssion(int a,int b,int n){
//        //information=int 1st term=0,2nd term=1;
//        //work=create the next term c=a+b
//        //base case=nth term
//        int c=a+b;
//        System.out.print(c);
//        fibonacciseriesrecurssion(b, c,n-1);
//    }
    public static int printXtopowN(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int ntp=printXtopowN(x,n-1);
        int pow=x*ntp;
        return pow;
    }
    public static int printXtopowNoptimistic(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        //if n is even
        if(n%2==0){
            return printXtopowNoptimistic(x,n/2) * printXtopowNoptimistic(x,n/2);
        }
        else{
            return printXtopowNoptimistic(x,n/2)* printXtopowNoptimistic(x,n/2)*x;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int k=sc.nextInt();
//        printNto1iterative(n);
//        printNto1recurssive(k);
        printSumOf1stN_Naturalnumbers(5);
        printSumOf1stN_Naturalnumbersrecurssive(5,0,0);
        System.out.println(calcfactorial(5));
        System.out.println(printXtopowN(2,3));
        System.out.println(printXtopowNoptimistic(2,3));

    }
}

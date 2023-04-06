import java.util.Scanner;
public class numberOfFactors {
    static int factorial(int n){
        if((n==0)||(n==1)){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    static void printDivisors(int n)
    {
        int count=0;
        for (int i=1;i<=n;i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=factorial(n);
        printDivisors(fact);


    }
}
    //Given a integer N, your task is to calculate the number of divisors in factorial of N.

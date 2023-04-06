import java.util.Scanner;

public class isPrime {
    static void ifIsPrime(long n){
        if (n==1){
            System.out.println("NO");
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        ifIsPrime(n);
    }
}

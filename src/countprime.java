import java.util.Scanner;

public class countprime {
//    public static boolean isPrime(long n){
//        if(n==1){
//            return false;
//        }
//        for(int i=2;i<=Math.sqrt(n);i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }

        public static boolean ifIsPrime(long n){
        if (n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
               return false;
            }
        }
        return true;
    }
    public static void countPrimes(int n){
        int count=0;
        for(int i=2;i<=n;i++){  // 2 3 4 5 6 7 8 9 10
            if(ifIsPrime(i)){
                count++;
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        countPrimes(n);
    }
}

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ifPrime {
    static boolean isPrime(long n){
        int count=0;
        for(int i=0;i<n/2;i++){
            if(n % i == 0)
                count++;
        }

        if(count != 0)
            return false;
        else
            return true;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        if(isPrime(x)){
            System.out.println(x);
        }
        else{
            while(! isPrime(x)){
                x++;
            }
            System.out.println(x);
        }
    }
}
public class javaPracticeSetCwh2 {
    static int fib(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else
            return fib(n-1) + fib(n-2);
    }
    static int sumrecurssive(int n){
        if(n==1){
            return 1;
        }
        return n + sumrecurssive(n-1);
    }
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d = %d \n ", n , i,n*i);
        }
    }
    public static void main(String[] args) {
        multiplication(7);
        pattern1(5);
        System.out.println(sumrecurssive(4));
        System.out.println(fib(10));
    }
}

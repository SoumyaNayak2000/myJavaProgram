import java.util.*;
public class checkEvenOddUsingBM {
    public static void checkKthBitSetOrNot(int n,int k){
        int g=1<<(k-1);
        if((n&g)!=0){
            System.out.println("SET");
        }
        else{
            System.out.println("NOT SET");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(); // 254
            int k=sc.nextInt(); // 4
            checkKthBitSetOrNot(n,k); // true
        }
    }
}

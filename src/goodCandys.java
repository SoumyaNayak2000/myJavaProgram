import java.util.Scanner;

public class goodCandys {
    static boolean ifOdd(int k){
        if(k%2==0){
            return true;
        }
        return false;
    }
    static int[] Goodcandys(int[] arr, int n){
        int noOfcandysPerBaloon=n/5;// n=10      n/5=2
        int []badcandys=new int[5]; //
//        83
        // [   0    16|    1    32 |    2     48 |   3    64  |   4  80  83 ] -> x
        //   96
        int count=0;
        int j=0;
        for(int i=1;i<=n;i++){
            if(!(ifOdd(i) == ifOdd(arr[i]))){ // [34 56] [25 67] [78 24]   [9   6]  [5  3] 12
                                           //     1  2    3   4   5   6     7   8    9 10  11
                count++;//1
            }
            // 1=2*(0+1)=1=2(false)
            // 2=2*(0+1)  2=2(true)
            // 3=2*(1+1)   3=4(false)
            if(i==noOfcandysPerBaloon*(j+1)){   // 1=2    j=1
                badcandys[j]=count;//    [1
                count=0;
                j++;
            }
        }
        badcandys[j-1]=badcandys[j-1]+count;
        return badcandys;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Goodcandys(arr,n);
    }
}

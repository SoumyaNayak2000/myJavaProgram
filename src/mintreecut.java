import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class mintreecut {
//.    sort , max vlue
// maxH

// maxH = 100000

// 1 - 1L
//checklogic


//.25K-----50K

    //  s<K
//. s=k
//. s>k
    public static int minValueOfX(int arr[],int n,int k){
        int l=0;
        int h=100000;  // you can calculate max height as well

        while(l<h){
            int mid=l+(h-l)/2;
            int woodCalculated=calculateWood(arr,mid,n);
            if(woodCalculated<=k){
                h=mid;
            }
            else{
                l=mid+1;
            }
        }

        return h;
    }
//.  k
    // 37
//.    lh
    //


    public static int calculateWood(int arr[],int x,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]-x >0){
                sum = sum + (arr[i]-x);
            }
        }
        return sum;
    }


    //      5 3 8 7 1
    //.     3=x


    // 0 1 2 3 4 .......................100000


    // K - 18      0.      5
    //          0  1  2  3  4
    //          19  17 13 7 2

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(minValueOfX(arr,n,k));
    }
}
// max value of X
// such that u can collect max k units

// k.   , array height N

//.   0 1 2 3 4 .....n


// X.   - at max K unit wood is collected

//.   | |
//.  ||||
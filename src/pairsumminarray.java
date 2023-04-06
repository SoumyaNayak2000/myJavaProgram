import java.util.Arrays;
import java.util.Scanner;

public class pairsumminarray {
//    static void buildingToConfrence(int arr[][],int n,int m ){
//        int MaxCount = 0;
//        int MaxCountRow = 0;
//        for (int i = 0; i < n; i++) {
//            int count = 0;
//            for (int j = 0; j < m; j++) {
//                if (arr[i][j] == 1) {
//                    count++;
//                }
//            }
//            if (count > MaxCount) {
//                MaxCountRow = i + 1;
////                MaxCount = count;
//                System.out.print(MaxCountRow);
//            }
//        }
//    }
    static void MaxSum(int[] arr,int n) {
        Arrays.sort(arr);
        int maxdiff1 = arr[n - 1] - arr[0];  //97
        int x = Math.max(arr[n - 1] - arr[1], arr[n - 2] - arr[0]); //96
        int maxdiff = maxdiff1 - x;
        System.out.println(maxdiff);
    }
////    static void findingpairsum(int[] arr,int n,int sum){
////        int l=0;
////        int r=n-1;
////        Arrays.sort(arr);
////        while(l<=r){
////            if(arr[l]+arr[r] == sum){
////                System.out.println(arr[l]+","+arr[r]);
////                return;
////            }
////            else if(arr[l]+arr[r]<sum){
////                l++;
////            }
////            else
////                r--;
////        }
////        System.out.println("pairsum is not available");
//         }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int m=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
        MaxSum(arr,n);
    }
}
//x buildings each building have y floors in every floor of that building there are some good people and some bad people
// 23 45 97 98 1 6 4 3
// 1 3 4 6 23 45 97 98       97    95 or 96    96   1

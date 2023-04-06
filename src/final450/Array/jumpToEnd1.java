package final450.Array;

import java.util.Scanner;

//11
//        1 3 5 8 9 2 6 7 6 8 9
class jumpToEnd1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(new Solution().minJumps(arr));
    }
}
class Solution{
    static int minJumps(int[] arr){
        // your code here
        int n=arr.length;
        int currEnd=0;
        int currFarthest=0;
        int jumps=0;
        for(int i=0;i<n-1;i++){   //   1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9
            currFarthest=Math.max(currFarthest,i+arr[i]);
            if(currEnd==i){
                jumps++;
                currEnd=currFarthest;
                if(currEnd>=n-1){
                    return jumps;
                }
            }
        }
        return -1;
    }
}

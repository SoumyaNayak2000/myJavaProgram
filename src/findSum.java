import java.util.*;


public class findSum {
    public static void pairSum(int[] arr,int sum){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
    public static void main(String[]args){
        int arr[]={2,4,6,8,9};
        int sum=12;
        pairSum(arr,sum);
    }


}
// 2 3 5 7 9
//12

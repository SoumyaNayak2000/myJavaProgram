package final450.Array;

import java.util.Scanner;

public class largestSumContigeousSubArray {
    public static void kadensAlgo(int arr[],int n){
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        int startIndex=0;
        int endIndex=0;
        int x=0;
        for(int i=0;i<n;i++){
            currentSum+=arr[i];
            if(currentSum>maxSum){
                maxSum=currentSum;
                startIndex=x;
                endIndex=i;
            }
            if(currentSum<0){
                currentSum=0;
                x=i+1;
            }
        }
        System.out.println("maximum sum found between "+startIndex+" and "+endIndex+" i.e "+ maxSum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        kadensAlgo(arr,n);
    }
}

package final450.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeTheHeight {
    public static void minimizeheight(int[] arr,int n,int k){
        //{1, 5, 15, 10}, k = 3
        //sort the array
        Arrays.sort(arr);
        //    1 5 10 15
        int tempmin=arr[0];
        int tempmax=arr[n-1];
        int ans=arr[n-1]-arr[0];
        for(int i=1;i<n;i++){

        }
    }
    //sort the array
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
}

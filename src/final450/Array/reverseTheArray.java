package final450.Array;

import java.util.Scanner;

public class reverseTheArray {
    public static void reverseRecurssive(int arr[],int n,int start,int end){

        if(start>=end){
            return;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverseRecurssive(arr,n,start+1,end-1);
    }
    public static void reverseArrayIterative(int arr[],int n){
        int start=0;
        int end=n-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=n-1;
        reverseArrayIterative(arr,n);
        printArray(arr,n);
        reverseRecurssive(arr,n,start,end);
        printArray(arr,n);
    }
}

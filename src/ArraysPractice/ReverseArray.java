package ArraysPractice;

import java.util.Scanner;

public class ReverseArray {
    static void recursivewayReverse(int arr[],int l,int r) {
        int temp;
        if(l>=r)
            return;
        temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        recursivewayReverse(arr,l+1, r-1);
    }

/*
    static void reversearray(int[] arr,int n){
        int l=0;
        int r=n-1;
        int temp;
        while(l<r){
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        }
*/

/*
        for (int i=0;i<n;i++){
            if(l<r){
                temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }

*/
    static void printArray(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=0;
        int r=n-1;
        recursivewayReverse(arr,l,r);
        //reversearray(arr,n);
        printArray(arr,n);
    }
}
//Given an array (or string), the task is to reverse the array/string.
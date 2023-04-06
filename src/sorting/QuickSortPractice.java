package sorting;

import java.util.Scanner;

public class QuickSortPractice {
    public static void swap(int arr[],int i,int j){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                swap(arr,i,j);
            }
        }
        i++;
        swap(arr,i,high);
        return i;
    }
    public static void QuickSort(int arr[],int low,int high){
        if(low<high){
            int P=partition(arr,low,high);
            QuickSort(arr,low,P-1);
            QuickSort(arr,P+1,high);
        }
    }
    public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        QuickSort(arr,0,n-1);
        printArray(arr,n);
    }
}

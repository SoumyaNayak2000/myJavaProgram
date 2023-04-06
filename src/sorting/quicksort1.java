package sorting;

import java.util.Scanner;

public class quicksort1 {
    public static int count=0;
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static int partition(int arr[],int l,int r){
        int pivot=arr[r];

        int i=l-1;

        for(int j=l;j<=r-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,r);
        return i+1;
    }
    public static void quickSort(int arr[],int l,int r){
        count++;
        if(l<r){
            int p = partition(arr,l,r);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,r);
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

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //System.out.println("1111");
        //System.out.println(arr);
        printArray(arr,n);
        System.out.println();

        quickSort(arr,0,n-1);

        printArray(arr,n);
        System.out.println();
        System.out.println(count);
    }
}

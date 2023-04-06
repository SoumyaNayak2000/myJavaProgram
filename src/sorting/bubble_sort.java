package sorting;

import java.util.Scanner;

public class bubble_sort {
    public static void print(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int[] arr){
       int n=arr.length;
       for(int i=0;i<n-1;i++){
           for(int j=0;j<n-1-i;j++){
               if(arr[j]>arr[j+1]){
                   //swap
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
    }
    public static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(arr[smallest]>arr[j]){
                        smallest=j;
                }
            }
            //swap
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionSort(int[] arr){
        int n=arr.length;
        //insertion sorting
        for(int i=1;i<n;i++){
            int current=arr[i];//current is refer to the elent which we will put in its specific position:
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // bubbleSort(arr);
        //selectionSort(arr);
        insertionSort(arr);
        print(arr);

    }
}

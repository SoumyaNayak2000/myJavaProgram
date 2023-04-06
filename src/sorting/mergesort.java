package sorting;

import java.util.*;
public class mergesort {
    public static void merge(int arr[],int l,int m,int r){
        int n1=m-l+1;  //element in first half
        int n2=r-m;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[m+1+j];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        //out of the loop
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
        System.out.println(arr[i]+"");
    }
    public static void mergeSort(int arr[],int l,int r){
        if(l<r){
            int m=l+(r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);

        }
    }
    public static void printArray(int arr[],int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr,n);
        System.out.println();

        mergeSort(arr,0,n-1);

    }
}
/*
0  1  2  3  4  5  6   7
30  20  40  4  8  80  10
*/

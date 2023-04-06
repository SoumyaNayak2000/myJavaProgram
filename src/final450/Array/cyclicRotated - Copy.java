package final450.Array;

import java.util.Scanner;

public class cyclicRotated {
    public static void rotate(int arr[],int n){
        //     6 2 3 4 5
        //     0 1 2 3 4
        int i=0;
        int j=n-1;
        while(i!=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
        }
    }
    public static void cyclicRotatedonetime(int arr[],int n){
        //     2 3 4 5 6
        //     0 1 2 3 4
        int x=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=x;
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
        cyclicRotatedonetime(arr,n);
        printArray(arr,n);
        rotate(arr,n);
        printArray(arr,n);
    }
}

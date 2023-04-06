package final450.Array;

import java.util.Scanner;

public class sort0s1s {
    public static void Sort0s1s(int arr[],int n){
        //    [0 0 0 0 0 1 1 1]
        //             p1
        //               p2

        int p1=0;
        int p2=n-1;
        while(p1<p2 ){

            if(arr[p1]==1)
            {
                if(arr[p2]==0) {
                    Swap(arr, p1, p2);
                    //p2--;
                }
                else{
                    p2--;
                }
            }
            else{
                p1++;
            }

        }
    }
    private static void Swap(int[] arr, int p1, int p2) {
        int temp;
        temp= arr[p1];
        arr[p1]= arr[p2];
        arr[p2]=temp;
    }
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
        Sort0s1s(arr,n);
        printArray(arr,n);
    }
}

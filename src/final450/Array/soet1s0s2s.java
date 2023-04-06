package final450.Array;

import java.util.Scanner;

public class soet1s0s2s {
    static void sort0s1s2s(int arr[],int n){
        int p1=0;
        int p2=0;
        int p3=n-1;
        int temp;
        //     {  0,   0,   0,   0,   0,   1,   1,   1,   1,   1,   2,   2  }
        //                                p1
        //                                                          p2
        //                                                     p3
       while(p2<=p3){
            if(arr[p2]==0){
                Swap(arr, p1, p2);
                p1++;
                p2++;
            } else if (arr[p2]==1) {
                p2++;
            }
            else if (arr[p2]==2){
                Swap(arr,p2,p3);//p2=0 p3=2
                p3--;
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
        sort0s1s2s(arr,n);
        printArray(arr,n);
    }
}

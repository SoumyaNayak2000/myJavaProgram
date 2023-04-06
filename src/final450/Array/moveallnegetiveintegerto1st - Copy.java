package final450.Array;

import java.util.Scanner;

public class moveallnegetiveintegerto1st {
    public static void movenegetive(int arr[],int n){
        //     -12, -13, 11, -5, 6, -7, 5, -3, -6
        //      i
        //      j
        // -12, -13, -5, -7, -3, -6, 5, 6, 11
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
               if(i!=j){
                    Swap(arr,i,j);
                    j++;
                }
               else{
                    j++;
                }
            }
            //j++;
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
        movenegetive(arr,n);
        printArray(arr,n);

    }
}

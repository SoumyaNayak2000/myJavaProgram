package final450.Array;

import java.util.Scanner;

public class moveNegetiveIntegerToEnd {
    public static void MoveNegetiveToEnd(int arr[],int n){
        //  1 -1 3 2 -7 -5 11 6
        //               i
        //                    j
        int j=n-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]<0){
                if(i!=j){
                    Swap(arr,i,j);
                    j--;
                }
                else{
                    j--;
                }
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
        MoveNegetiveToEnd(arr,n);
        printArray(arr,n);

    }
}

//
//        Your Output:
//        1 3 2 11 6 -5 -1 -7
//        Expected Output:
//        1 3 2 11 6 -1 -7 -5


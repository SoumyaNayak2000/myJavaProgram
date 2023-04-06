package sorting;

import java.util.Scanner;

public class bubblesort1 {
    //  1 3 4 5 7 9

    //static int count=0;

    public static void bubbleSort(int arr[],int n){
        boolean isSwaaped;
        for(int i=0;i<n-1;i++){   // after every pass bring max to the last
            isSwaaped=false;
            for(int j=0;j<n-i-1;j++){ // actual comparisons
                //count++;
                if(arr[j]<arr[j+1]){
                    //swap them
                    isSwaaped=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(isSwaaped==false){
                break;
            }
        }
        //
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


       // for(int i=0;i<n;i++){ // unsorted
       //     System.out.print(arr[i]+" ");
       // }
        //System.out.println();
        bubbleSort(arr,n);

        for(int i=0;i<n;i++){ // sorted
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        //System.out.println(count);

    }
}
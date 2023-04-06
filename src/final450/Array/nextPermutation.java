package final450.Array;

import java.util.Scanner;

public class nextPermutation {
    public static void findingNextPermutation(int arr[],int n){
        int idx=-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>arr[i-1]){
                idx=i;
                break;
            }
        }
        int nearestelement=idx;
        for(int i=idx;i<n;i++){
            if(arr[i]>arr[idx-1] && arr[i]<=arr[nearestelement]) {
                nearestelement = i;
            }
        }
        //swapping between nearestelement and idx-1
        int temp=arr[nearestelement];
        arr[nearestelement]=arr[idx-1];
        arr[idx-1]=temp;

        //reversing from idx to length
       // 1 5 8 5 1 6 4 3 7

        int arrayLength=n-1;
        while(idx<arrayLength){
            swap(arr,idx,arrayLength);
            idx++;
            arrayLength--;
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
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
        findingNextPermutation(arr,n);
        printArray(arr,n);
    }
}

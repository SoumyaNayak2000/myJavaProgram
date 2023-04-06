import java.util.Scanner;

public class InsertionSort {

    //34 39 39 45
    public static void insertionSort(int arr[],int n){
        for(int i=1;i<n;i++){
            int k=arr[i]; // take each and every element
            int j=i-1;
            while(j>=0 && arr[j]>k){ // go back
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=k; // inserting it in right position
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        for(int i=0;i<n;i++){ // unsorted
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        insertionSort(arr,n);

        for(int i=0;i<n;i++){ // sorted
            System.out.print(arr[i]+" ");
        }

    }
}
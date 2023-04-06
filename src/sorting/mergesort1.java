package sorting;

import java.util.Scanner;

public class mergesort1 {
    //merge 2 sorted halves inside this aaray from l to m, m+1 to r

    //[7 12 16 17  19  20  31] arr
    // 0        3  4      6
    //                     k

    // L [12 16 17 20 ]  4
    //                   i

    // R [7  19  31 40 50 ]    5
    //           j
    public  static void merge(int arr[],int l, int m,int r){
        int n1= m-l+1; //elements in first half
        int n2= r-m;// in 2nd half

        int L[]=new int[n1]; //[ , , , ]
        int R[]=new int[n2];

        for(int i=0;i<n1;i++){ // copying first half
            L[i]=arr[l+i];
        }

        for(int j=0;j<n2;j++){ // coplying 2nd half
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

        // out of the loop when any of the array completes
        // copying the remaining elements
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
    }

    public static void mergeSort(int arr[], int l, int r) { // arr, 0 , n-1
        if (l < r) { // at least 2 elements are there
            int m = l + (r - l) / 2;   // Middle element of array
            mergeSort(arr, l, m); //Calling for first half sorting
            mergeSort(arr, m + 1, r); //Calling for second half sorting
            merge(arr, l, m, r); // Merging the sorted sub solutions
        }
    }

    public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //System.out.println("1111");
        System.out.println(arr);

        printArray(arr,n);
        System.out.println();

        mergeSort(arr,0,n-1);

        printArray(arr,n);
    }
}
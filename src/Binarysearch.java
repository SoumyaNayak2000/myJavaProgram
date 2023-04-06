import java.util.Scanner;

public class Binarysearch {

    // arr , starting, ending

    // 2 6 9 14 19 25,      0, 5 ,     25
    // 0 1 2 3

    // 0 + 3 =3
    // 0 + 2 =2

    // l+r /2


    //  14    0, 5 ,    17
    //  3
    //  l,r

    //  4 3              17


    // 2 4 7 9 13 16 19 20 25        , 6 , 5,           18
    // 0 1 2 3  4  5  6  7  8
    //             m
    public static int binarySearch(int arr[],int l,int r,int k){
        if(l<=r) { // if this is false, no element to search
            int mid = l + (r - l) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {  // ignore left side to search
                return binarySearch(arr, mid + 1, r, k);
            } else if (arr[mid] > k) {  // ignore right side to search
                return binarySearch(arr, l, mid - 1, k);
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int index=binarySearch(arr,0,n-1,k);

        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+ index);
        }
    }
}

import java.util.*;
public class median {
    public static void mergeArrays(int[] arr, int[] brr, int n1, int n2, int[] arr3){
        int i = 0;
        int j = 0;
        int k = 0;

        // traverse the arr and insert its element in arr3
        while(i < n1){
            arr3[k++] = arr[i++];
        }

        // now traverse brr and insert in arr3
        while(j < n2){
            arr3[k++] = brr[j++];
        }

        // sort the whole array arr3


    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int brr[]=new int[m];
        for(int j=0;j<m;j++){
            brr[j]=sc.nextInt();
        }
        int n1 = arr.length;
        int n2 = brr.length;
        int arr3[] = new int[n1 + n2];
        mergeArrays(arr, brr, n1, n2, arr3);

        //System.out.println("Array after merging");
        for (int i=0; i < n1+n2; i++) {
            System.out.print(arr3[i] + " ");
        }
        Arrays.sort(arr3);

        for(int k=0;k<=arr3.length;k++) {
            if (arr3.length % 2 == 0) {
                int mid=arr3.length/2;
                int median= mid+(mid+1);
                System.out.println(arr3[median]);
            }
            else {
                int median1=arr3.length/2;
                System.out.println(arr3[median1]);
            }
        }

    }
}
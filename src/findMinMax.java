import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class findMinMax {
    static void findingMinMax(int arr[],int n ,int k){
        Arrays.sort(arr);
        System.out.println("minimum element in the array is " + arr[0] + " Maximum element in the array is " + arr[n - 1]);
//        for(int i=0;i<n;i++) {
//            System.out.println("minimum element in the array is" + arr[0] + "Maximum element in the array is" + arr[n - 1]);
//        }
        System.out.println("minimum kth element in the array is " + arr[k]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
//        for(int element:arr){
//            System.out.println(element);
//        }
        findingMinMax(arr,n,k);
    }
}

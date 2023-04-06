import java.util.Arrays;
import java.util.Scanner;

public class pairsuminarray {
    static int pairsuminarr(int arr[],int n,int sum){
        Arrays.sort(arr);
        int l=0;
        int r=n-1;
        int count=0;
        while(l<r){
            if(arr[l]+arr[r]>=sum){
                count=count+(r-l);
                r--;
            }
                l++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        System.out.println(pairsuminarr(arr,n,sum));
    }
}
//2 4 5 6 7
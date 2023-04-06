import java.util.Arrays;
import java.util.Scanner;

public class CodingMarathon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr); // 1 3 4 6
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[n-(i+1)];
        }
        System.out.println(sum);
    }
}

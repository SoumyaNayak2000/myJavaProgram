import java.util.*;
public class centeredmean {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
            count++;
        }
       int centeredmean =sum/count;
        System.out.println(centeredmean);
    }
}
//2 2 4 6 8
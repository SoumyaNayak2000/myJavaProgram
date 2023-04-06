import java.sql.SQLOutput;
import java.util.*;
public class secondmaximumdifference {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int secondmaximumdifference=arr[1] - arr[n-1];
        System.out.println(Math.abs(secondmaximumdifference));
    }
}

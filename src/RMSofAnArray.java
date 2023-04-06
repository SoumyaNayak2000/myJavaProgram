import java.util.*;
public class RMSofAnArray {
    public static void rms(int arr[],int n){
        double sum=0;
        double avg=0;
        double sqrt=0;
        for(int i=0;i<n;i++){
            sum += Math.pow(arr[i],2);
            avg=sum/n;
            sqrt=Math.sqrt(avg);
        }
        System.out.printf("%.6f",sqrt);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rms(arr,n);
    }
}

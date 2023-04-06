package final450.Array;

import java.util.Scanner;

public class Maximumandminimumofanarrayusingminimumnumberofcomparisons {
    public static void Maximumandminimumofanarray(int[] arr,int n){
        int max;
        int min;
        if(n==1){
             max=arr[0];
             min=arr[0];
        }
        else{
            if(arr[0]>arr[1]){
                 max=arr[0];
                 min=arr[1];
            }
            else{
                 max=arr[1];
                 min=arr[0];
            }
            for(int i=2;i<n;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
                if(arr[i]<min){
                    min=arr[i];
                }
            }
        }
        System.out.println("max value is"+ max+" , "+"minimum value is"+min);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Maximumandminimumofanarray(arr,n);
    }
}

package Wileyedge;

import java.util.Arrays;
import java.util.Scanner;

public class football_matches {
    public static void footbalmatch(int arr1[],int arr2[],int n,int m){
        Arrays.sort(arr1);  // 1 2 4 4
          int count=0;// 2
        for(int i=0;i<m;i++){
                count=0;for(int j=0;j<n;j++){
                if (arr1[j]<=arr2[i]){
                    count++;
                }
                else{
                    break;
                }
            }
            System.out.print(count+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        footbalmatch(arr1,arr2,n,m);
    }
}


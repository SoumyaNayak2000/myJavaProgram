package final450.Array;

import java.util.Scanner;

public class unionOfTwoSortedArrays {
    public static void unionOfTwoArray(int arr1[],int arr2[],int n,int m){
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }
            else if(arr2[j]<arr1[i]){
                System.out.print(arr2[j]+" ");
                j++;
            }
            else if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
        while(i<n){
            System.out.print(arr1[i]+" ");
            i++;
        }
        while(j<m){
            System.out.print(arr2[j]+" ");
            j++;
        }
    }
    public static void intersectionOfTwoArray(int arr1[],int arr2[],int n,int m){
        int i=0;
        int j=0;
        while(i<n && j<m) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        unionOfTwoArray(arr1,arr2,n,m);
        System.out.println();
        intersectionOfTwoArray(arr1,arr2,n,m);
    }
}

package Arena;

import java.util.Scanner;

public class Count0S1S {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                a++;
            }
            else{
                b++;
            }
        }
        System.out.println(a +" "+ b);
    }
}

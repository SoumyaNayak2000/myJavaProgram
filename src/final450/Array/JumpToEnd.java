package final450.Array;

import java.util.Scanner;

public class JumpToEnd {
    public static void jumpcount(int[] arr,int n){
        //     1, 4, 3, 2, 6, 7
        int jump = 0 ;
        int last = n - 1 ;
        for( int i = n-2 ; i>=0 ; i--)
        {
            if(arr[i] >= last-i ){// n-1-n+2

                jump++;//1
                last = i;
            }
        }
        if(last == 0)
            System.out.println(jump);
        else
            System.out.println(-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0 ; i < n ; i++)
            {
                arr[i] = sc.nextInt();
            }
            jumpcount(arr,n);
    }
}
/*
  1 2 3 0 1 1 0
  f
*/

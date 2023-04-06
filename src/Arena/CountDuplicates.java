package Arena;

import java.util.HashMap;
import java.util.Scanner;

public class CountDuplicates {
    public static void printDuplicates(int[] arr,int n){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                Integer count=map.get(arr[i]);
                map.put(arr[i],count);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for (Integer number : map.keySet()) {
            //System.out.println(map.keySet());
            if (map.get(number) > 1) {
                System.out.println(number + " " + map.get(number));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printDuplicates(arr,n);
    }
}
//       Sample Input:-
//       5
//       3 2 1 1 2
//      Sample Output:-
//      1 2
//      2 2

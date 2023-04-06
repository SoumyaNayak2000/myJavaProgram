import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class findDuplicates {

    public static void findDuplicates(int arr[],int n){
        HashMap<Integer,Integer> hm=new HashMap();

        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                int count=hm.get(arr[i]);//5
                hm.put(arr[i],count+1);
            }else{
                hm.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }

    }
// /
    // ,,,,,,,,, 13


    // [int,int]
    //  13->6
    //  11->1
    //  17->3

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        findDuplicates(arr,n);

//        String str="rphiot";
//        str.length()
    }

}
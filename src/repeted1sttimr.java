import java.util.HashMap;
import java.util.Scanner;

public class repeted1sttimr {
    public static void find1stOccurance(int[] arr){
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(hm.containsKey(arr[i])){
                System.out.println(arr[i]);
                break;
            }
            else{
                hm.put(arr[i],1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={5,4,3,5,7,9,6,2,3,4};
        int arr2[]={1,2,3,5,6,7,8};
        find1stOccurance(arr);
    }
}

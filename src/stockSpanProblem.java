import java.util.Scanner;
import java.util.Stack;

public class stockSpanProblem {
    public static void ssp(int arr[],int n){
        Stack<Integer>s=new Stack<>();
        int res[]=new int[n];
       int count=0;
        for(int i=0;i<n;i++){
            if(s.isEmpty()){
                res[i]=0;
            }
            else if (s.size()>0 && s.peek()>arr[i]){
//                res[i];
            }
            else if (s.size()>0 && s.peek()<=arr[i])
            {                                           // 0   1  2  3  4  5  6
                while(s.size()>0 && s.peek()<=arr[i]){ // 100 80 60 70 60 75 85      0  0  1  1  3  1  0
                    s.pop();
                    count++;
                }
                if(s.isEmpty()){
                    res[i]=i+1;
                }
                else{
                    res[i]=count+1;
                }
            }
            s.add(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ssp(arr,n);
    }
}


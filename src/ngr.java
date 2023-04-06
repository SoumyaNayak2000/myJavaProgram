import java.util.Scanner;
import java.util.Stack;

public class ngr {
    public static void NGR(int arr[],int n){
        int res[]=new int[n];
        Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--){               //   1   3   2   4
            if(s.isEmpty()){
                res[i]=-1;
            }
            else if(s.size() > 0 && s.peek()>arr[i]){
               res[i]=s.peek();
            }
            else if(s.size() > 0 && s.peek()<=arr[i]){
               while (s.size()>0 && s.peek()<=arr[i]){
                   s.pop();
               }
               if(s.size()==0){
                   res[i]=-1;
               }else{
                   res[i]=s.peek();
               }
            }
            s.add(arr[i]);
        }
        for (int i= 0; i < n; i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 3, 0, 0, 2, 4, 5};
        int n = arr.length;
        NGR(arr, n);

    }

}
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class quesOftheDay {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        for(int j=0;j<M;j++){
            set.add(sc.nextInt());

        }

        int[] arr=new int[N+1];
        arr[0]=1;
        for(int i=0;i<=N;i++){
            if(set.contains(i)){
                arr[i]=0;
            }
            else{
                arr[i]=(arr[i-1]+arr[i-2])%1000000007;
            }
        }
        System.out.println(arr[N]);
    }
}
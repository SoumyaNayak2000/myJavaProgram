import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class stringremoval {
    public static void largestStringAfterRemoval(String st,int n,int k){
        Deque<Character>deque=new LinkedList<>();
        for(int i=0;i<n;i++){
            char c=st.charAt(i);
            while(!deque.isEmpty() && k>0){
                if(deque.peekLast()<c){
                    deque.removeLast();
                }
                else{
                    break;
                }
                k--;
            }
            if(deque.size()<=n-k){
                deque.addLast(c);
            }

        }
        String s="";
        while(!deque.isEmpty()){
            s=s+deque.removeFirst();
        }
        System.out.println(s);
    }

    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String st=sc.next();
        int k=sc.nextInt();
        largestStringAfterRemoval(st,n,k);
    }
}
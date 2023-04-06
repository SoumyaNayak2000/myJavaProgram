package recurssion;

public class toweOfHanoi {
    public static void towerOfHanoi(int n,String src,String helper,String destination){
        if(n==1){
            System.out.println(" transfer disks " + n +" from "+src+" to "+destination );
            return;
        }
        towerOfHanoi(n-1,src,destination,helper);
        System.out.println(" transfer disk " + n +" from "+src+" to "+destination );
        towerOfHanoi(n-1,helper,src,destination);
    }
    public static void main(String[] args) {
        int n=3;
        towerOfHanoi(7,"s","h","d");
    }
}

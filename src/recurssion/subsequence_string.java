package recurssion;

public class subsequence_string {
    public static void subsequences(String str,int index,String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char current=str.charAt(index);
        //this current character has two choices
        //1->to be in new String
        subsequences(str,index+1,newString+current);

        //2->Not to be in new String
        subsequences(str,index+1,newString);
    }
    public static void main(String[] args) {
        subsequences("abcd",0,"");
    }
}

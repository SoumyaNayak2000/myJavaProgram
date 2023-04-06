package recurssion;

public class findOccurance {
    public static int first=-1;
    public static int last=-1;
    public static void findOccuranceofAnElement(String str,int index,char element){
        if(index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char Current=str.charAt(index);
        if(Current==element){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        findOccuranceofAnElement(str,index+1,element);
    }
    public static void main(String[] args) {
        findOccuranceofAnElement("aabdcaayavdsaa",0,'a');

    }
}

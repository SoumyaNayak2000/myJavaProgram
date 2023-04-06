package recurssion;

public class moveallXtoTheend {
    public static void MoveAllX(String str,int index,int count,String newString){
        if(index==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currenetchar=str.charAt(index);
        if(currenetchar=='x'){
            count++;
            MoveAllX(str,index+1,count,newString);
        }
        else {
            newString+=currenetchar;
            MoveAllX(str,index+1,count,newString);
        }
    }
    public static void main(String[] args) {
        MoveAllX("axbxcxdxxz",0,0,"");
    }
}

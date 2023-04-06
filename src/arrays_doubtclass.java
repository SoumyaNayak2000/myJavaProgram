public class arrays_doubtclass {
    public static void main(String[] args) {
        long a=20;
        Long b=30L;
        int c=10;
        Integer d=40;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        modify(a,b,c,d);

    }
   public static void modify(long a,Long b,int c,Integer d){
        a=a+20;
        b=b+20;
        c=c+5;
        d=d+3;
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
    }
}

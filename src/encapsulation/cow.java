package encapsulation;

public class cow implements animallss {
    public void sound()
    {
        System.out.println("mmmmmm");
    }
    public void sleep(){
        System.out.println("zzzzzz");
    }

    public static void main(String[] args) {
       // animallss obj=new cow();
        animallss obj=new cow();
        obj.sleep();
        obj.sound();
    }
}

class employee2{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setName(String n){
        name= n;
    }
}
public class Oops2 {
    public static void main(String[] args) {
        employee2 Soumya=new employee2();
        Soumya.setName("Soumya Ranjan Nayak");
        Soumya.salary= 230;
       System.out.println( Soumya.getname());
        System.out.println( Soumya.getsalary());
    }
}

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Teacher
{

    String name;
    int age;
    private int salary;



    public void getDetails(String name ,int age, int  salary)
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary: "+salary);
    }

    public int  setSalary(int salary)
    {
        this.salary=salary;
        return salary;
    }
    public  int  getSalary(int salary)
    {
        return this.salary;
    }

}

class teacher{
    static  Scanner sc=new Scanner(System.in);
    public static void main (String[] args)
    {
        Teacher teac= new Teacher();
        String namee=sc.next();
        int agee =sc.nextInt();
        int salary=sc.nextInt();
        teac.name=namee;
        teac.age=agee;
        //teac.getSalary(salary);
        teac.setSalary(salary);
        teac.getDetails(namee,agee,salary);


    }
}
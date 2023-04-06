import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Teacher2{
    String name;
    int age;
    private int salary;

    Teacher2(String name,int age,int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public void printDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Salary:  "+this.salary);
    }
}

class TeacherDetails {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        int salary=sc.nextInt();
        Teacher2 obj=new Teacher2(name,age,salary);
        obj.printDetails();
    }
}

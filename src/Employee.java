class oops1st_class{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("Employee name is :"+name);
        System.out.println("Employee id is :"+id);
    }
    public void getsalary(){
        System.out.println("my Salary is: "+salary);
    }
}
public class Employee {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        oops1st_class Soumya = new oops1st_class(); // Instantiating a new Employee Object
        oops1st_class Ranjan = new oops1st_class(); // Instantiating a new Employee Object
        Soumya.name="Soumya Ranjan Nayak";
        Soumya.id=12;
        Soumya.salary=5600;
        Ranjan.name="Soumya Ranjan Nayak";
        Ranjan.id=13;
        Ranjan.salary=7600;
        Soumya.printDetails();
        Soumya.getsalary();

    }
}

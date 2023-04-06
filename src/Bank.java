class Account_Details{
    private int account_num;
    private String Name;

    public int getAccount_num() {
        return account_num;
    }

    public void setAccount_num(int account_num) {
        this.account_num = account_num;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
class Bank_Details{
    private int Branch_Code;
    public String Branch_Name;

    public int getBranch_Code() {
        return Branch_Code;
    }

    public void setBranch_Code(int fund) {
        this.Branch_Code = fund;
    }

    public String getBranch_Name() {
        return Branch_Name;
    }

    public void setBranch_Name(String branch_Name) {
        Branch_Name = branch_Name;
    }
}
class Employee_Details{
    public String E_name;
    public int number;
    //private employee_id;

    public String getE_name() {
        return E_name;
    }

    public void setE_name(String e_name) {
        E_name = e_name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
public class Bank {
    public static void main(String[] args) {
        Account_Details p1=new Account_Details();
        Bank_Details p2=new Bank_Details();
        p1.setAccount_num(76548923);
        System.out.println(p1.getAccount_num());
        p2.setBranch_Code(2254);
        System.out.println(p2.getBranch_Code());

    }
}

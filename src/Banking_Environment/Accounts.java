package Banking_Environment;

 class Users{
     String User1;
     String Name;
     private String Password;

     public String getUser1() {
         return User1;
     }

     public void setUser1(String user1) {
         User1 = user1;
     }

     public String getName() {
         return Name;
     }

     public void setName(String name) {
         Name = name;
     }

     public String getPassword() {
         return Password;
     }

     public void setPassword(String password) {
         Password = password;
     }
 }
public abstract class Accounts {
     String Type;
     int funds;
    void typeOfAccount(){
        System.out.println("Type of Account Is:"+Type);
    }
    abstract int deposit();
    abstract int withdrawn();
}

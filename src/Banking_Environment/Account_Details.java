package Banking_Environment;

public abstract class Account_Details extends Accounts {
    void typeOfAccount(){
        System.out.println("Type of Account Is:"+Type);
    }
     int deposit(int a){
        return a;
    }
     int withdrawn(int b){
        return b;
     }
}

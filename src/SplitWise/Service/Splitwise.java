package SplitWise.Service;

import SplitWise.Domain.Expense;
import SplitWise.Domain.user;

public class Splitwise {
    //Driver code
    public static void main(String[] args) {
        user Rohit=new user(1,"Rohit","Male",468643278,"rohit45@gmail.com");
        user Soumya=new user(2,"Soumya","Male",468643378,"Soumya34@gmail.com");
        user Shresthya=new user(3,"Shresthya","FeMale",468643478,"Shresthya32@gmail.com");
        user Kunu=new user(4,"Kunu","FeMale",468643578,"Kunu@gmail.com");
        SplitwiseService splitwiseService=new SplitwiseServiceImplementation();
        String Expense1="Expense 1 1000 4 1 2 3 4 EQUAL";//string se hum extract
        Expense expense1obj=filterInput(Expense1);//filter input convert string objects to array
        splitwiseService.addExpense(expense1obj);

        String Expense2="Expense 2 800 3 1 3 4 EXACT 200 200 400";
        String Expense3="Expense 3 1200 2 3 4 EQUAL";
        String Expense4="Expense 4 1800 3 2 3 4 PERCENT 20 60 20";


    }
    public static Expense filterInput(String input){
                                                   //   0     1  2   3 4 5 6 7 8
        String[] partition=input.split(" ");//"Expense 1 1000 4 1 2 3 4 EQUAL";
        int i=1;                                  //                  0 1 2 3
        int byUserId=Integer.parseInt(partition[i]);
        Double amount=Double.parseDouble(partition[++i]);
        int usersInvolved=Integer.parseInt(partition[++i]);
        int[] Usersinvolvedlist=new int[usersInvolved];
        for(int j=0;j<usersInvolved;j++){
            Usersinvolvedlist[j]=Integer.parseInt(partition[++i]);
        }
        String expenseType=partition[++i];
        double[] partitionlist=new double[usersInvolved];
        if(!expenseType.equals("EQUAL")){
            for(int j=0;j<usersInvolved;j++){
                partitionlist[j]=Double.parseDouble(partition[++i]);
            }
        }
        Expense expense=new Expense(byUserId,amount,usersInvolved,expenseType,Usersinvolvedlist,partitionlist);
        return expense;
    }
}
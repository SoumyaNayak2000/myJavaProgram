package SplitWise.Service;

import SplitWise.Domain.Expense;

import java.util.HashMap;
import java.util.Map;

public class SplitwiseServiceImplementation implements SplitwiseService{
         //payee         owedId  amount
    Map<Integer, Map<Integer,Double>>expenseHashmap=new HashMap<>();
    // Expense object
    //    String Expense1="Expense 1 1000 4 1 2 3 4 EQUAL";
    //    String Expense2="Expense 2 800 3 1 3 4 EXACT 200 200 400";
    //    String Expense3="Expense 3 1200 2 3 4 EQUAL";
    //    String Expense4="Expense 4 1800 3 2 3 4 PERCENT 20 60 20";
    public void addExpense(Expense expense) {
        Double paidAmount= expense.getAmount();//1000
        int usersInvolvedInexpense= expense.getNumberOfUserInvolved();
        Double[] amountToDistribute=new Double[usersInvolvedInexpense];
        if(expense.getExpenseType().equals("EQUAL")){
            Double IndividualsAmount=paidAmount/usersInvolvedInexpense;
            for(int i=0;i<usersInvolvedInexpense;i++){
                amountToDistribute[i]=IndividualsAmount;
            }
           // hydrateMap(expense,amountTiDistribute);

        }


        else if (expense.getExpenseType().equals("EXACT")) {
            for(int i=0;i<usersInvolvedInexpense;i++){
                amountToDistribute[i]=expense.getNumberToPartition()[i];
            }
            // hydrateMap(expense,amountTiDistribute);
        }


        else{
            for(int i=0;i<usersInvolvedInexpense;i++){
                amountToDistribute[i]=paidAmount * expense.getNumberToPartition()[i] / 100;
            }
            // hydrateMap(expense,amountTiDistribute);
        }

    }

    public void showExpense() {

    }

    public void showExpense(int userId) {

    }
}

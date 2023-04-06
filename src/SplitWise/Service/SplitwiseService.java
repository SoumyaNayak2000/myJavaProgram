package SplitWise.Service;

import SplitWise.Domain.Expense;

public interface SplitwiseService {
    void addExpense(Expense expense);
    void showExpense();
    void showExpense(int userId);
}
//1  1000 4 1 2 3 4 EQUAL [250 250 650 250]
//2  1200 3 1 3 4 EQUAL [600 400 200]
//1  800  2 1 3 EQUAL [400 400]

package SplitWise.Domain;

public class Expense {
    int byUserId;//the user expenses:           u1
    double Amount;//expenses                    1000
    int numberOfUserInvolved;//uses involved     4
    String expenseType;//equal,exact,percent
    int[] userList;//[u1 u2 u3]
    double[] numberToPartition;//[x ,y ,z]

    public Expense(int byUserId, double amount, int numberOfUserInvolved, String expenseType, int[] userList, double[] numberToPartition) {
        this.byUserId = byUserId;
        Amount = amount;
        this.numberOfUserInvolved = numberOfUserInvolved;
        this.expenseType = expenseType;
        this.userList = userList;
        this.numberToPartition = numberToPartition;
    }

    public int getByUserId() {
        return byUserId;
    }

    public void setByUserId(int byUserId) {
        this.byUserId = byUserId;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public int getNumberOfUserInvolved() {
        return numberOfUserInvolved;
    }

    public void setNumberOfUserInvolved(int numberOfUserInvolved) {
        this.numberOfUserInvolved = numberOfUserInvolved;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public int[] getUserList() {
        return userList;
    }

    public void setUserList(int[] userList) {
        this.userList = userList;
    }

    public double[] getNumberToPartition() {
        return numberToPartition;
    }

    public void setNumberToPartition(double[] numberToPartition) {
        this.numberToPartition = numberToPartition;
    }
}

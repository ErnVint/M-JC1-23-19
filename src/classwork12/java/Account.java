public class Account {
    private User userId;
    private String accNumber = "MYXX01234567";
    private double amount = 0d;

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userId=" + userId +
                ", accNumber='" + accNumber + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Account(User userId, String accNumber, double amount) {
        this.userId = userId;
        this.accNumber = accNumber;
        this.amount = amount;
    }
}

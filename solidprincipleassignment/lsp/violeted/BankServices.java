package solidprincipleassignment.lsp.violeted;

public interface BankServices {
    public double deposit(double amount);
    public double withdraw(double amount);
    public double getBalance();
    public void sendOTP(String mode);
    public void printPassbook(String size);
    public void HomeEquityLoans();
    public void AutoLoans();
    public void PersonalLoans();
}

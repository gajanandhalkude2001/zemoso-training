package solidprincipleassignment.lsp.violeted;

public class FedaralBank implements BankServices{
    @Override
    public double deposit(double amount) {
        return 0;
    }

    @Override
    public double withdraw(double amount) {
        return 0;
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void sendOTP(String mode) {

    }

    @Override
    public void printPassbook(String size) {

    }

    @Override
    public void HomeEquityLoans() {

    }

    @Override
    public void AutoLoans() {

    }

    @Override
    public void PersonalLoans() {
        //Not applicable for FedaralBank, so it violating LSP.
    }
}

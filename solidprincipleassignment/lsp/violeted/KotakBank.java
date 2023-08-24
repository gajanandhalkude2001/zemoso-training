package solidprincipleassignment.lsp.violeted;

public class KotakBank implements BankServices{
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
    //Not applicable For KotakBank, so it violating LSP
    }

    @Override
    public void PersonalLoans() {

    }
}

package solidprincipleassignment.lsp.corrected;

import solidprincipleassignment.lsp.violeted.BankServices;

public class KotakBankServices implements AutoLoansService, NewBankServices {
    @Override
    public void AutoLoans() {
        System.out.println("Providing AutoLoans Service");
    }

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
}

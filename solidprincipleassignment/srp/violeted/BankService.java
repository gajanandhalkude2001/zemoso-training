package solidprincipleassignment.srp.violeted;

public class BankService {
    double balance=0;
    public double deposit(double amount)
    {
        balance = balance+amount;
        return 0;
    }

    public double withdraw(double amount)
    {
        balance = balance - amount;
        return 0;
    }
    public void printPassbook(String size)
    {
        if(size =="A4")
            System.out.println("Printing in A4");
        if(size == "A3")
            System.out.println("Printing in A3");
    }
//    public double getBalance()
//    {
//        return balance;
//    }
    public void sendOTP(String mode)
    {
        if(mode=="mobile")
        {
            System.out.println("sms through mobile");
        }
    }

}

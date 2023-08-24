package solidprincipleassignment.dip.corrected;
interface BankDetails
{
    void userDetails(String name , int accountNumber);
}
class ReceiverBank implements BankDetails
{
    String name;
    int acountNumber;
    public void userDetails(String name, int accountNumber)
    {
        this.name = name;
        this.acountNumber = accountNumber;
    }

}
class TransferMoney
{
    int amount;
    public void transferMoney(ReceiverBank RS , int amount)
    {
        this.amount = amount;
        System.out.println("Rs:" +amount+" "+"Transfered to"+ " " + RS.name + " "+"AC"+" "+ RS.acountNumber);
    }
}

public class CompleteTransfer
{
    public static void main(String args[])
    {
        ReceiverBank receiverbank = new ReceiverBank();
        receiverbank.userDetails("Gajanand", 98765);
        TransferMoney transfermoney = new TransferMoney();
        transfermoney.transferMoney(receiverbank,5000);
    }
}

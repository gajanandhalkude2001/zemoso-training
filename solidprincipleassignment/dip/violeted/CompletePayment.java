package solidprincipleassignment.dip.violeted;

class ReceiverBank
{
    String name;
    int acountNumber;
    ReceiverBank(String name , int accountNumber)
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
        System.out.println("Rs:" +amount+" "+"Transfered to"+ " " + RS.name + " "+ RS.acountNumber);
    }
}
public class CompletePayment
{
    public static void main(String args[])
    {
        ReceiverBank receiverbank = new ReceiverBank("Gajanand" , 901410859);
        ReceiverBank receiverbank1 = new ReceiverBank("Charan" , 965228);
        TransferMoney money = new TransferMoney();
        money.transferMoney(receiverbank,1000);
        money.transferMoney(receiverbank1,2000);
    }
}

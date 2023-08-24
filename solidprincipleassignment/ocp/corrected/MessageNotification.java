package solidprincipleassignment.ocp.corrected;

public class MessageNotification implements NotificationService{
    @Override
    public void sendOTP(String mode) {
        System.out.println("Sending msg through Message");    }

    @Override
    public void remainingAmount() {
        System.out.println("Remaining Amount through Message");
    }
}

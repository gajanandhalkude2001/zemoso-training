package solidprincipleassignment.ocp.corrected;

public class WhatsUpNotification implements NotificationService{
    @Override
    public void sendOTP(String mode) {
        System.out.println("Sending msg through whatsUp");
    }

    @Override
    public void remainingAmount() {
        System.out.println("balance - Amount");
    }
}

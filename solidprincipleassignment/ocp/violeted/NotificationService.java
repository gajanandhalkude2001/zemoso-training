package solidprincipleassignment.ocp.violeted;

public class NotificationService
{
        public void sendOTP(String mode)
        {
            if(mode=="mobile")
            {
                System.out.println("sms through mobile");
            }
            if(mode == "email")
            {
                System.out.println("sms through email");
            }
        }
}


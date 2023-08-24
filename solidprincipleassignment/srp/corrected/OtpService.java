package solidprincipleassignment.srp.corrected;

public class OtpService {
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

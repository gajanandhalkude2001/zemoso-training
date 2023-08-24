package solidprincipleassignment.isp.corrected;

public class UnionBankServices implements NewBankingTypes{
    @Override
    public void MobileBanking() {
        System.out.println("MObile Banking");
    }

    @Override
    public void OnlineBanking() {
        System.out.println("Online Banking");
    }

    @Override
    public void HomeBanking() {
        System.out.println("Home Banking");
    }
}

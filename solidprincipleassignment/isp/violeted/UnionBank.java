package solidprincipleassignment.isp.violeted;

public class UnionBank implements BankingTypes{
    @Override
    public void MobileBanking() {

    }

    @Override
    public void OnlineBanking() {

    }

    @Override
    public void HomeBanking() {

    }

    @Override
    public void PriorityBanking() {
        //UnionBank not supporting PriorityBanking features, this violets Interface Segregation Principle
    }
}

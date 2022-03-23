public class Coin {

    private CoinType coinType;
    private Coin coin;

    public Coin(CoinType coinType) {
        this.coinType = coinType;
    }

    public CoinType getCoinType() {
        return coinType;
    }

    public void setCoinType(CoinType coinType) {
        this.coinType = coinType;
    }

    public double getCoinValue(){
        return coinType.getValue();
    };
}

import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Drawer> drawers;
    private ArrayList<Coin> coinsEntered;
    private CoinReturn coinReturn;

    public VendingMachine(ArrayList<Drawer> drawers, ArrayList<Coin> coinsEntered, CoinReturn coinReturn) {
        this.drawers = drawers;
        this.coinsEntered = coinsEntered;
        this.coinReturn = coinReturn;
    }

    public ArrayList<Drawer> getDrawers() {
        return drawers;
    }

    public void setDrawers(ArrayList<Drawer> drawers) {
        this.drawers = drawers;
    }

    public ArrayList<Coin> getCoinsEntered() {
        return coinsEntered;
    }

    public void setCoinsEntered(ArrayList<Coin> coinsEntered) {
        this.coinsEntered = coinsEntered;
    }

    public CoinReturn getCoinReturn() {
        return coinReturn;
    }

    public void setCoinReturn(CoinReturn coinReturn) {
        this.coinReturn = coinReturn;
    }

    public void addCoin(Coin coin){
        this.coinsEntered.add(coin);
    }
}

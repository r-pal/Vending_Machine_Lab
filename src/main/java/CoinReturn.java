import java.util.ArrayList;

public class CoinReturn {

    private ArrayList<Coin> rejectedCoins;

    public CoinReturn() {
        this.rejectedCoins = new ArrayList<>();
    }

    public ArrayList<Coin> getRejectedCoins() {
        return rejectedCoins;
    }

    public void setRejectedCoins(ArrayList<Coin> rejectedCoins) {
        this.rejectedCoins = rejectedCoins;
    }

    public double coinReturnTotal(){
        double total = 0.00;
        for (Coin coin: rejectedCoins){
            total += coin.getCoinType().getValue();
        }
        return total;
    }

    public void addCoinToCoinReturn(Coin coin){
        this.rejectedCoins.add(coin);
    }

    public int coinListSize(){
        return this.rejectedCoins.size();
    }
}

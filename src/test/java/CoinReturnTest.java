import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CoinReturnTest {

    CoinReturn returnedCoins;
    Coin coin1;
    Coin coin2;


    @Before
    public void setup(){
        coin1 = new Coin(CoinType.ONE_PENCE);
        coin2 = new Coin(CoinType.TWO_PENCE);
        returnedCoins = new CoinReturn();

    }

    @Test
    public void canAddCoins(){
        returnedCoins.addCoinToCoinReturn(coin1);
        assertEquals(0.01, returnedCoins.coinReturnTotal(), 0.0);
    }

    @Test
    public void arrayStartsEmpty(){
//        ArrayList<Coin> rejectedCoin = new ArrayList<Coin>();
        assertEquals(0, returnedCoins.coinListSize());
    }

}

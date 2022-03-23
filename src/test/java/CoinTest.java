import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    Coin coin1;
    CoinType coinType;

    @Before
    public void setUP(){
        coin1 = new Coin(CoinType.FIFTY_PENCE);

    }

    @Test
    public void hasValue(){
        assertEquals(0.50, coin1.getCoinValue(), 0.0);
    };


}

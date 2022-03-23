import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DrawerTest {

    Drawer drawer1;
    Crisps crisps1;
    ArrayList arrayList1;

    @Before
    public void setUp(){
        drawer1 = new Drawer (DrawerType.A1, 0.50);
        arrayList1 = new ArrayList<Crisps>();
    }

    @Test
    public void testPutProductInDrawer(){
        drawer1.putProductInDrawer(crisps1);
        assertEquals(1, drawer1.productListSize());
    }

    @Test
    public void testPrice(){
        assertEquals(0.50, drawer1.getPrice(), 0.0);
    }

//    @Test
//    public void productListEmpty(){
//        assertEquals(0, products.size());
//    }

}

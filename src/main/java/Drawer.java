import java.util.ArrayList;

public class Drawer {



    private DrawerType drawerType;
    private ArrayList<Product> products;
    private double Price;


    public Drawer(DrawerType drawerType, double price) {
        this.drawerType = drawerType;
        Price = price;
        this.products = new ArrayList<Product>();
    }

    public DrawerType getDrawerType() {
        return drawerType;
    }

    public void setDrawerType(DrawerType drawerType) {
        this.drawerType = drawerType;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void putProductInDrawer(Product product){
        this.products.add(product);
    }

    public int productListSize(){
        return this.products.size();
    }
}

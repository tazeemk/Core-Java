package Collection.Product_Inventory_Management_System;

public class Product
{

    String productName;
    double price;
    int quantity;

    public Product(String productName, double price, int quantity) {
this.productName=productName;
        this.price = price;
        this.quantity = quantity;

    }

    @Override
    public String toString() {
        return  productName + "  "+ price + "  "+ quantity ;
    }
}

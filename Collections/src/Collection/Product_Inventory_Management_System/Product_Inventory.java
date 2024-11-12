package Collection.Product_Inventory_Management_System;

import java.util.*;

public class Product_Inventory
{
    Scanner sc = new Scanner(System.in);

    HashMap<Integer,Product>tm = new HashMap<Integer,Product>();
    int nextProdcutid=101;
    public void productInventr() {
        Product p1 = new Product("chocolate", 120, 90);
        Product p2 = new Product("shops", 20, 1190);
        Product p3 = new Product("cakes", 320, 290);
        Product p4 = new Product("Beans", 80, 3190);
        tm.put(nextProdcutid,p1);
        tm.put(nextProdcutid++,p2);
        tm.put(nextProdcutid++,p3);
        tm.put(nextProdcutid++,p4);

    }
    public void AddProductDetail()
    {

        System.out.println("Enter productID,ProductName,ProductPrice,ProductQuantity :");
        String pname =sc.next();
        int price=sc.nextInt();
        int pQty=sc.nextInt();
        int ProductId=nextProdcutid++;
        tm.put(ProductId,new Product(pname,price,pQty));
        ArrayList<Object>al=new ArrayList<Object>(tm.entrySet());
        System.out.println("Product Added Successfully...");
        System.out.println(al);
    }
    void remove_product()
    {
        System.out.println("Please Enter productId to remove");
        int id=sc.nextInt();
        ArrayList<Object>al = new ArrayList<Object>(tm.keySet());
        al.remove(id);
        System.out.println("Product Removed Successfully...");
    }
    void update_quantity()
    {
        System.out.println("Please Enter Id to update Quantity :");
        int id = sc.nextInt();
        System.out.println("Please Enter New Quantity :");
        int nq = sc.nextInt();
      //  tm.put(id,nq);
    }
    void allproductdisplay()
    {
        System.out.println("Inventry :");
        for (Map.Entry<Integer,Product>entry:tm.entrySet())
        {
            System.out.println(" Id"+entry.getKey()+" "+entry.getValue());
        }
    }


    public static void main(String[] args){
    Product_Inventory obj = new Product_Inventory();
         //obj.Add_Product_Detail();
         obj.allproductdisplay();


    }
}

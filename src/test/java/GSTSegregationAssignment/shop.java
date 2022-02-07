package GSTSegregationAssignment;

import java.util.ArrayList;
import java.util.List;

public class shop {

    public String productType;
    public List<products> ProductList;

    public shop() {
        ProductList = new ArrayList<>();
    }

    //to get all products which are eligible for GST
    public ArrayList<products> getAllGstProducts(products... addproduct) {
        ArrayList<products> gstProducts = new ArrayList<>();
        for (products product : addproduct) {
            if (product.getGstRate() != 0)
                gstProducts.add(product);
        }
        return gstProducts;
    }

    //To get products having price more than 2000 including GST
    public List<products> getGstProductsHavingPriceMoreThan2000(products... addproduct) {
        List<products> gstProducts = new ArrayList<>();
        for (products product1 : addproduct) {
            if (toGetTotalPriceIncliudingGST(product1) > 2000) {
                gstProducts.add(product1);
            }
        }
        return gstProducts;
    }

    // to find total price of the Product including GST
    public float toGetTotalPriceIncliudingGST(products... addproduct) {
        float totPrice = 0;
        ArrayList<products> gstProducts = new ArrayList<>();
        for (products product : addproduct) {
            float gstAmount = (product.getBasePrice() * product.getGstRate()) / 100;
             totPrice= product.getBasePrice() + gstAmount;
        }
        return totPrice;
    }
}









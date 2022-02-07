package GSTSegregationAssignment;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class GSTTests {

    shop product;

    @Test
    public void getGSTEligibleProducts(){

        product= new shop();

        AC ac = new AC("LG", 20000.0f, "Black", 28);
        dishwasher dishwasher = new dishwasher("IFB", 40000.00f, "Silver", 28);
        product.addProduct(ac,dishwasher);

        List<products> gstProducts = product.getAllGstProducts();

        //Assertion
        for (products product1 :gstProducts) {

            Assert.assertTrue(product1 instanceof AC || product1 instanceof dishwasher);

        }

    }

    @Test
       public void productHavingPriceMoreThan2000(){
        product = new shop();
        AC ac = new AC("LG", 20000.0f, "Black", 28);
        dishwasher dishwasher = new dishwasher("IFB", 40000.00f, "Silver", 28);

        product.addProduct(ac,dishwasher);
        List<products> gstProducts = product.getGstProductsHavingPriceMoreThan2000();

        //Assertion
        for (products product1 : gstProducts) {

            Assert.assertTrue(product1 instanceof AC || product1 instanceof dishwasher);

        }
    }


    @Test
    public void getTotalPriceOfGSTProductsIncludingGST(){
        product= new shop();
        AC ac = new AC("LG", 20000.0f, "Black", 28);
        dishwasher dishwasher = new dishwasher("IFB", 40000.00f, "Silver", 28);

        product.addProduct(ac,dishwasher);
        float price = product.toGetTotalPriceIncliudingGST(ac,dishwasher);

        //Assertion
        List<products> product = new ArrayList<>();
        for (products product1 : product) {

            Assert.assertTrue(product1 instanceof AC || product1 instanceof dishwasher);

        }
    }
}

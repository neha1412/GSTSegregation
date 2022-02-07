package GSTSegregationAssignment;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class GSTTests {

    @Test
    public void getGSTEligibleProducts(){

        AC ac = new AC("LG", 20000.0f, "Black", 28);
        dishwasher dishwasher = new dishwasher("IFB", 40000.00f, "Silver", 28);
        List<products> gstProducts = new ArrayList<>();

        shop shops= new shop();
        //shops.getAllGstProducts(ac,dishwasher);

        //Assertion
        for (products product1 :shops.getAllGstProducts(ac,dishwasher)) {

            Assert.assertTrue(product1 instanceof AC || product1 instanceof dishwasher);

        }

    }

    @Test
       public void productHavingPriceMoreThan2000(){
        AC ac = new AC("LG", 20000.0f, "Black", 28);
        dishwasher dishwasher = new dishwasher("IFB", 40000.00f, "Silver", 28);
        List<products> gstProducts = new ArrayList<>();
        shop shops= new shop();
        //shops.getGstProductsHavingPriceMoreThan2000();

        //Assertion
        for (products product1 : shops.getGstProductsHavingPriceMoreThan2000()) {

            Assert.assertTrue(product1 instanceof AC || product1 instanceof dishwasher);

        }
    }


    @Test
    public void getTotalPriceOfGSTProductsIncludingGST(){
        AC ac = new AC("LG", 20000.0f, "Black", 28);
        dishwasher dishwasher = new dishwasher("IFB", 40000.00f, "Silver", 28);
        List<products> gstProducts = new ArrayList<>();
        shop shops= new shop();
        shops.toGetTotalPriceIncliudingGST(ac,dishwasher);

        //Assertion
        List<products> product = new ArrayList<>();
        for (products product1 : product) {

            Assert.assertTrue(product1 instanceof AC || product1 instanceof dishwasher);

        }
    }
}

package test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import salestaxKata.SalesTax;

public class TestSalesTax {

	SalesTax st = new SalesTax();
	ArrayList productList = new ArrayList();
	
	@Test
	public void testTaxCalc()
	{
		productList.add("book");
		productList.add("musiccd");
		productList.add("chocolate");
		
		Assert.assertEquals(29.83,st.taxCalculator(productList));
	}
	
	
	@Test
	public void ShouldCalculateSalesTaxonNonExemptedProducts()
	{
		String neprod = null;
		
		//Double salesTax = st.calculateSalesTaxOnNonexemptedProducts(neprod);
		
	}
	
}


package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import salestaxKata.SalesTax;

public class TestSalesTax {

	SalesTax st = new SalesTax();
	ArrayList<String> productList = new ArrayList<String>();
	
	@Test
	public void testTaxCalc()
	{
		productList.add("book");
		productList.add("musiccd");
		productList.add("chocolate");
		productList.add("impChocolate");
				
		Assert.assertEquals(29.83,st.taxCalculator(productList));
	}
	@Test
	public void testNeprodTax()
	{
		assertEquals(Double.valueOf(1.499), st.calculateSalesTaxOnNonexemptedProducts("musiccd"));
	}
	
	@Test
	public void testExemptedprodTax()
	{
		assertEquals(Double.valueOf(0.85), st.calculateSalesTaxOnexemptedProducts("chocolate"));
	}
	@Test
	public void testImportedProdTax()
	{
		assertEquals(Double.valueOf(7.125), st.calculateImportTaxOnImportedProducts("impPerfume"));
	}
	
	
}


package salestaxKata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import test.Products;

public class SalesTax {
	Map products = new HashMap<String, Double>();
	
	static final double salesTax = 10.00;
	static final double importTax = 5.00;
	
	public void acceptInput()
	{
		
	}
	
	public Double calculateSalesTaxOnNonexemptedProducts(String neprod) {
		double price = (double) products.get(neprod);
		double stax = price*(0.10); 
		double total = price + stax;
		return total;
	}
	
	public Double calculateSalesTaxOnexemptedProducts(String eprod) {
		double price = (double) products.get(eprod);
		double stax = price*(0.00); 
		double total = price + stax;
		return total;
	}

	public Double calculateImportTaxOnImportedProducts(String iprod) {
		double price = (double) products.get(iprod);
		double stax = price*(0.15); 
		double total = price + stax;
		return total;
	}

	public Object taxCalculator(ArrayList productList) {

		
		return null;
	}
	
	
}

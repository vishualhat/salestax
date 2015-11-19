package salestaxKata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

import test.Products;

public class SalesTax {
	Map<String, Double> products = new HashMap<String, Double>();

	Map<String, Double> productTax = new HashMap<String, Double>();
	Products prod = new Products(null);

	static final double salesTax = 0.100;
	static final double importTax = 0.150;

	public void addToMap() {
		products.putAll(prod.getExemptedProducts());
		products.putAll(prod.getProducts());
		products.putAll(prod.getImportedProducts());
	}

	public Double calculateSalesTaxOnNonexemptedProducts(String neprod) {
		addToMap();
		double price = Double.valueOf(products.get(neprod));
		double stax = price * salesTax;
		//double total = price + stax;
		return stax;
	}

	public Double calculateSalesTaxOnexemptedProducts(String eprod) {
		addToMap();
		double price = Double.valueOf(products.get(eprod));
		double stax = price;
		return stax;
	}

	public Double calculateImportTaxOnImportedProducts(String iprod) {
		addToMap();
		double price = Double.valueOf((double) products.get(iprod));
		double stax = price * importTax;
		return stax;
	}

	public Map<String, Double> taxCalculator(ArrayList<String> productList) {

		ListIterator<String> iterator = productList.listIterator();
		while (iterator.hasNext()) {
			String currentItem = iterator.previous();
			if (prod.getProducts().containsKey(currentItem))

			{	
				// calculateSalesTaxOnNonexemptedProducts(currentItem);
				double tax = calculateSalesTaxOnNonexemptedProducts(currentItem);
				productTax.put(iterator.next(), tax);
			}
			if (prod.getExemptedProducts().containsKey(iterator.next()))

			{
				// calculateSalesTaxOnNonexemptedProducts(iterator.next());
				double tax = calculateSalesTaxOnexemptedProducts(iterator.next());
				productTax.put(iterator.next(), tax);
			}
			if (prod.getExemptedProducts().containsKey(iterator.next()))

			{
				// calculateImportTaxOnImportedProducts(iterator.next());
				double tax = calculateImportTaxOnImportedProducts(iterator.next());
				productTax.put(iterator.next(), tax);
			}
		}
		return productTax;
	}
}

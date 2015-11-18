package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Products {

	Map<String, Double> nonExemptedProducts = new HashMap<String, Double>();
	Map<String, Double> exemptedProducts = new HashMap<String, Double>();
	Map<String, Double> importedProducts = new HashMap<String, Double>();

	public Products(String ProductName) {

		nonExemptedProducts.put("music", 14.99);
		nonExemptedProducts.put("chocolate", 0.85);
		importedProducts.put("impChocolate", 10.00);
		importedProducts.put("impPerfume", 47.50);
		exemptedProducts.put("book", 12.49);
		exemptedProducts.put("chocolate", 0.85);
		// return product.keySet();
	}

	/**
	 * @return the products
	 */
	public Map<String, Double> getProducts() {
		return nonExemptedProducts;
	}

	/**
	 * @return the exemptedProducts
	 */
	public Map<String, Double> getExemptedProducts() {
		return exemptedProducts;
	}

	/**
	 * @return the importedProducts
	 */
	public Map<String, Double> getImportedProducts() {
		return importedProducts;
	}
}

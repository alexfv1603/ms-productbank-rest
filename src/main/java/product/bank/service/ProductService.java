package product.bank.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {

	boolean insertProduct(Product product);
	List<Product> products();
	
}

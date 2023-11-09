package product.bank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;

import product.bank.repository.ProductRepository;
import product.bank.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public boolean insertProduct(Product product) {
		try {
			productRepository.save(product);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Product> products() {
		return productRepository.findAll();
	}

}

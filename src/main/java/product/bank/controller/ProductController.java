package product.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;

import product.bank.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping
	public ResponseEntity<Boolean> insert(@RequestBody Product product) {
		boolean status = productService.insertProduct(product);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> clients() {
		List<Product> products = productService.products();
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
}

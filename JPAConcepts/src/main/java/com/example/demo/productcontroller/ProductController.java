package com.example.demo.productcontroller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.productentity.ProductEntity;
import com.example.demo.productrepo.ProductRepository;
import com.example.demo.productserviceimp.ProductServiceimp;

@RestController
public class ProductController {

	public static Logger logger = LoggerFactory.getLogger(ProductController.class);
	@Autowired
	ProductServiceimp productService;

	@GetMapping("/getProductdetails")
	public List<ProductEntity> getProducts() {
		return productService.getProducts();
	}

	@GetMapping("/getProductdetails/{productId}")
	public ResponseEntity<Optional<ProductEntity>> getProductById(@PathVariable int productId) {
		return productService.getProductById(productId);
	}

	@PostMapping("/createProductdetails")
	public ResponseEntity<ProductEntity> createProduct(@RequestBody ProductEntity product) {
		return productService.createProduct(product);
	}

	@PutMapping("/saveProductdetails")
	public ResponseEntity<ProductEntity> saveProduct(@RequestBody ProductEntity product) {
		return productService.saveProduct(product);
	}
	
}

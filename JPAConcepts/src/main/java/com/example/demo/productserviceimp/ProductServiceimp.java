package com.example.demo.productserviceimp;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.productentity.ProductEntity;
import com.example.demo.productrepo.ProductRepository;

@Service
public class ProductServiceimp {

	public static Logger logger = LoggerFactory.getLogger(ProductServiceimp.class);

	@Autowired
	ProductRepository productRepo;

	public List<ProductEntity> getProducts() {
		logger.info("All the product details are fetched successfully.");
		return productRepo.findAll();
	}

	public ResponseEntity<Optional<ProductEntity>> getProductById(int productId) {
		Optional<ProductEntity> findById = productRepo.findById(productId);
		return ResponseEntity.status(HttpStatus.FOUND).body(findById);
	}

	public ResponseEntity<ProductEntity> createProduct(ProductEntity product) {
		logger.info("product details are created successfully.");
		ProductEntity save = productRepo.save(product);
		return ResponseEntity.status(HttpStatus.CREATED).body(save);
	}

	public ResponseEntity<ProductEntity> saveProduct(ProductEntity product) {
		ProductEntity save = productRepo.save(product);
		return ResponseEntity.ok().body(save);
	}

}

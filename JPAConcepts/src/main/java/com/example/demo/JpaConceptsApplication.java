package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.productentity.ProductEntity;
import com.example.demo.productrepo.ProductRepository;

@SpringBootApplication
public class JpaConceptsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaConceptsApplication.class, args);
	}

	public static final Logger logger = LoggerFactory.getLogger(JpaConceptsApplication.class);

//	@Bean
//	public CommandLineRunner productdetails(ProductRepository repository) {
//		return (args) -> {
//			// saving product details in h2 db
//			repository.save(new ProductEntity(1, "IPHONE", 50000, 1));
//			repository.save(new ProductEntity(2, "VIVO", 30000, 1));
//			repository.save(new ProductEntity(3, "REALME", 17499, 2));
//			repository.save(new ProductEntity(4, "samsung", 25399, 4));
//
//			for (ProductEntity produts : repository.findAll()) {
//				logger.info(produts.toString());
//			}
//			logger.info("\nAll the 4 product details are fetched successfully.");
//
//			Optional<ProductEntity> productId = repository.findById(2);
//			logger.info(productId.toString());
//			logger.info("\nproductid='2' is fetched successfully.");
//
//			List<ProductEntity> productName = repository.findByproductName("IPHONE");
//			logger.info(productName.toString());
//			logger.info("\nproductName=IPHONE and its details are fetched successfully.");
//
//		};
//	}
}

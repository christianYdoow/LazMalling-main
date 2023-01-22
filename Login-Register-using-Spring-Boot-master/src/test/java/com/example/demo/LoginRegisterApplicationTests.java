package com.example.demo;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LoginRegisterApplicationTests {

	@Autowired
	private ProductRepository repo;

	@Test
	void contextLoads() {
	}

	@Test
	public void testFindAllProduct(){
		List<Product> products=repo.findAll();

		for(Product product:products){
			Long id = product.getProductId();
			String cat=product.getProductCategory();
			String name=product.getProductName();

			System.out.format("%d %s %s",id,cat,name);
		}
		System.out.println("");
	}

}

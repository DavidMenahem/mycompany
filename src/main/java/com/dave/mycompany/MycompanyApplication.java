package com.dave.mycompany;

import com.dave.mycompany.data.Node;;
import com.dave.mycompany.model.Product;
import com.dave.mycompany.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.interceptor.CacheableOperation;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class MycompanyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MycompanyApplication.class, args);
		PrintProducts printProducts = ctx.getBean("printProducts",PrintProducts.class);
		printProducts.createTree();
	}
}

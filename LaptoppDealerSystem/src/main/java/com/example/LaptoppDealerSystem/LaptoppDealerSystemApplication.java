package com.example.LaptoppDealerSystem;

import jakarta.el.BeanNameResolver;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LaptoppDealerSystemApplication {

	public static void main(String[] args) {


		ApplicationContext context =
				SpringApplication.run(
						LaptoppDealerSystemApplication.class,
						args);

		LaptopDealer dealer =
				context.getBean(LaptopDealer.class);

		dealer.sellLaptop();

	}

}

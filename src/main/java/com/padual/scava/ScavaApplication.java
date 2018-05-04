package com.padual.scava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScavaApplication {

	private static final Logger logger = LoggerFactory.getLogger(ScavaApplication.class);
	
	private static ApplicationContext appCtx;
	
	public static void main(String[] args) {
		appCtx = SpringApplication.run(ScavaApplication.class, args);
		BeanA beanA = appCtx.getBean(BeanA.class);
		logger.info(beanA.getSometext());
		BeanB beanB = appCtx.getBean(BeanB.class);
		logger.info(beanB.getSometext());
	}
}

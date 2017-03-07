package com.hyman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JettyEmbedServer jettyEmbedServer = (JettyEmbedServer)context.getBean("jettyEmbedServer");
		jettyEmbedServer.start();
		jettyEmbedServer.join();
	}
}
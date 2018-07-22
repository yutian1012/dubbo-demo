package org.sjq.dubbo;

import org.sjq.dubbo.client.InvokeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DubboClientApplication {
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DubboClientApplication.class, args);
		InvokeService invokeService=context.getBean(InvokeService.class);
		System.out.println(invokeService.hello.say("tttt"));
	}
}

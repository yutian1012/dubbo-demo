package org.sjq.dubbo.service;

import org.sjq.dubbo.api.IHello;

import com.alibaba.dubbo.config.annotation.Service;

@Service(loadbalance="roundrobin")
public class HelloImpl implements IHello{

	@Override
	public String say(String msg) {
		System.out.println("hello:"+msg);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "provider"+msg;
	}
}

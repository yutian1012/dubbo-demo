package org.sjq.dubbo.gateway;

import org.sjq.dubbo.api.IHello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class RpcController {

	@Reference(mock="return 服务关闭")
	private IHello hello;
	
	@RequestMapping(value="/")
	public String say(){
		System.out.println("invoke say method");
		return hello.say("rpc");
	}
}

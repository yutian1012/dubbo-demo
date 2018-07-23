package org.sjq.dubbo.api.mock;

import org.sjq.dubbo.api.IHello;
/**
 * 服务降级处理类
 */
public class IHelloMock implements IHello{

	@Override
	public String say(String msg) {
		return "服务降级";
	}

}

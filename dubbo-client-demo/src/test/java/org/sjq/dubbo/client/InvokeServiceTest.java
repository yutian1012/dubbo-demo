package org.sjq.dubbo.client;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class InvokeServiceTest {
	
	@Resource
	private InvokeService invokeService;

	@Test
	public void test() {
		String result=invokeService.hello.say("www.baidu.com");
		System.out.println(result);
		//assertTrue("www.baidu.com".equals(result));
	}

}

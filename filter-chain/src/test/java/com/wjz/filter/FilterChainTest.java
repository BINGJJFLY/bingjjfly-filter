package com.wjz.filter;

import org.junit.Test;

import com.wjz.demo.Invocation;
import com.wjz.demo.Invoker;

public class FilterChainTest {

	/**
	 * 执行结果：
	 * 
	 * ValidationFilter对请求信息进行校验 
	 * ActiveLimitFilter进行并发限制 
	 * MonitorFilter进行监听
	 * Invoker执行invoke方法 
	 * EchoFilter打印执行结果 
	 * CacheFilter将结果放入缓存
	 */
	@Test
	public void test() {
		Invoker invoker = FilterChain.buildFilterChain(new Invoker());
		invoker.invoke(new Invocation());
	}
}

package com.wjz.filter;

import org.junit.Test;

import com.wjz.demo.Invocation;
import com.wjz.demo.Invoker;

public class FilterChainTest {

	/**
	 * ִ�н����
	 * 
	 * ValidationFilter��������Ϣ����У�� 
	 * ActiveLimitFilter���в������� 
	 * MonitorFilter���м���
	 * Invokerִ��invoke���� 
	 * EchoFilter��ӡִ�н�� 
	 * CacheFilter��������뻺��
	 */
	@Test
	public void test() {
		Invoker invoker = FilterChain.buildFilterChain(new Invoker());
		invoker.invoke(new Invocation());
	}
}

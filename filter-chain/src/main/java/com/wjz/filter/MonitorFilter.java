package com.wjz.filter;

import com.wjz.demo.Invocation;
import com.wjz.demo.Invoker;
import com.wjz.demo.Result;

public class MonitorFilter implements Filter {

	@Override
	public Result invoke(Invoker invoker, Invocation invocation) {
		System.out.println("MonitorFilter½øÐÐ¼àÌý");
		return invoker.invoke(invocation);
	}

	@Override
	public int getOrder() {
		return -800;
	}

}

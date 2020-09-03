package com.wjz.filter;

import com.wjz.demo.Invocation;
import com.wjz.demo.Invoker;
import com.wjz.demo.Result;

public class EchoFilter implements Filter {

	@Override
	public Result invoke(Invoker invoker, Invocation invocation) {
		Result result = invoker.invoke(invocation);
		System.out.println("EchoFilter打印执行结果");
		return result;
	}

	@Override
	public int getOrder() {
		return -600;
	}

}

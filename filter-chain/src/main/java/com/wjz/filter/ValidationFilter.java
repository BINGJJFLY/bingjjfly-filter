package com.wjz.filter;

import com.wjz.demo.Invocation;
import com.wjz.demo.Invoker;
import com.wjz.demo.Result;

public class ValidationFilter implements Filter {

	@Override
	public Result invoke(Invoker invoker, Invocation invocation) {
		System.out.println("ValidationFilter对请求信息进行校验");
		return invoker.invoke(invocation);
	}

	@Override
	public int getOrder() {
		return -1000;
	}

}

package com.wjz.filter;

import com.wjz.demo.Invocation;
import com.wjz.demo.Invoker;
import com.wjz.demo.Result;

public class ActiveLimitFilter implements Filter {

	@Override
	public Result invoke(Invoker invoker, Invocation invocation) {
		System.out.println("ActiveLimitFilter进行并发限制");
		return invoker.invoke(invocation);
	}

	@Override
	public int getOrder() {
		return -900;
	}

}

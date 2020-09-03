package com.wjz.filter;

import com.wjz.demo.Invocation;
import com.wjz.demo.Invoker;
import com.wjz.demo.Result;

/**
 * Invoker执行时经过Filter链处理
 * 
 * @author wangjz
 *
 */
public interface Filter extends Ordered {

	Result invoke(Invoker invoker, Invocation invocation);
}

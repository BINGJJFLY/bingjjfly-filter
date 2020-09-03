package com.wjz.filter;

import com.wjz.demo.Invocation;
import com.wjz.demo.Invoker;
import com.wjz.demo.Result;

/**
 * Invokerִ��ʱ����Filter������
 * 
 * @author wangjz
 *
 */
public interface Filter extends Ordered {

	Result invoke(Invoker invoker, Invocation invocation);
}

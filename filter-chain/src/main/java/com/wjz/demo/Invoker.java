package com.wjz.demo;

public class Invoker {

	public Result invoke(Invocation invocation) {
		System.out.println("Invokerִ��invoke����");
		return new Result();
	}
}

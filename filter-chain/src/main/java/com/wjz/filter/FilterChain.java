package com.wjz.filter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.wjz.demo.Invocation;
import com.wjz.demo.Invoker;
import com.wjz.demo.Result;

public class FilterChain {

	private static final List<Filter> filters = Arrays.asList(new ActiveLimitFilter(), new CacheFilter(), new EchoFilter(),
			new MonitorFilter(), new ValidationFilter());

	public static Invoker buildFilterChain(Invoker invoker) {
		Invoker last = invoker;
		List<Filter> filters = getFilters();
		if (!filters.isEmpty()) {
			for (int i = filters.size() - 1; i >= 0; i--) {
				final Filter filter = filters.get(i);
				final Invoker next = last;
				last = new Invoker() {
					@Override
					public Result invoke(Invocation invocation) {
						return filter.invoke(next, invocation);
					}
				};
			}
		}
		return last;
	}

	private static List<Filter> getFilters() {
		return filters.stream().sorted(Comparator.comparing(Filter::getOrder)).collect(Collectors.toList());
	}

}

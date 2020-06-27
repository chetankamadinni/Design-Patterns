package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TwitterProxy implements InvocationHandler {

	private Object obj;

	public TwitterProxy(Object obj) {
		this.obj = obj;
	}

	public static Object newInstance(Object obj) {
		return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
				new TwitterProxy(obj));
	}

	@Override
	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		Object result;
		if (m.getName().contains("post")) {
			throw new IllegalAccessException("Cannot post on twitter feeds");
		} else {
			result = m.invoke(obj, args);
		}
		return result;
	}

}

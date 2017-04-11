package com.spymemcached;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Name  :SpyMemcached
 * @Desc  :TODO
 * @author:zhu
 * @date  :2016年9月2日
 */
public class SpyMemcached {

	/**
	 * @Desc  :TODO
	 * @param :
	 * @throws:
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_memcached.xml");
		SpyMemcachedManager memcachedManager = (SpyMemcachedManager) context.getBean("memcachedManager");
		//memcachedManager.add("key", "value", 1000);
		System.out.println(memcachedManager.get("testkey"));
		memcachedManager.printStats();
	}

}

package com.wangde007;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("hello world");
	}

	/**
	 * new String声明的字符串对象和其他东西比较只能equals方法，
	 * 基本类型的String 和字符串常量直接用==可以，
	 */
	@Test
	public void testCompareTo()
	{
		String a=new String("abc");
		String b= "abc";
		System.out.println("a:"+a+"\n"+"b:"+b);
		System.out.println(a==a);
	}

}

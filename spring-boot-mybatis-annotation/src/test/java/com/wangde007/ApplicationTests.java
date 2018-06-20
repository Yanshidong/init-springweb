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

	@Test
	public void testCompareTo()
	{
		Integer a=3;
		System.out.println(!(a.equals(2)));
	}

}

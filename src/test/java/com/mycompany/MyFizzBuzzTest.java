package com.mycompany;

import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName: MyFizzBuzz
 * @Description:FizzBuzz替换测试类
 * @author 黄晓锋
 * @date 2019-06-27 下午6:35:17
 * @version V1.0
 */
public class MyFizzBuzzTest {


	/**
	 * <p>测试MyFizzBuzz的insteadSuitFizzBuzz方法</p>
	 */
	@Test
    public void Test(){
		Assert.assertEquals(MyFizzBuzz.insteadSuitFizzBuzz(3), "Fizz");   
		Assert.assertEquals(MyFizzBuzz.insteadSuitFizzBuzz(5), "Buzz");  
		Assert.assertEquals(MyFizzBuzz.insteadSuitFizzBuzz(15), "FizzBuzz");   
    }
}

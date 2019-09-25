package com.mycompany;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: MyFizzBuzz
 * @Description:FizzBuzz替换
 * @author 黄晓锋
 * @date 2019-06-27 下午6:30:17
 * @version V1.0
 * update 11
 */
public class MyFizzBuzz {


	/**
	 * <p>从1遍历100 ，如果遇到数字为3的倍数的时候，打印“Fizz”替代数字，
	 *     如果5的倍数用“Buzz”代替。
	 *     既是3的倍数又是5的倍数打印“FizzBuzz” ，否则打印原数字 .
	 * </p>
	 */
	public static void insteadFizzBuzzFrom1To100(){
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println("FizzBuzz");
			}else if(i%3==0){
				System.out.println("Fizz");
			}else if(i%5==0){
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
		}
	}

	
	/**
	 * <p>
	 *     如果inputNum入参遇到数字为3的倍数的时候，
	 *     打印“Fizz”替代数字，5的倍数用“Buzz”代替，
	 *     既是3的倍数又是5的倍数打印“FizzBuzz”
	 *  </p>
	 * @param inputNum 输入参数
	 */
	public static String insteadSuitFizzBuzz(int inputNum){
		if(inputNum>0){
			if(inputNum%3==0&&inputNum%5==0){
				System.out.println("FizzBuzz");
				return "FizzBuzz";
			}else if(inputNum%3==0){
				System.out.println("Fizz");
				return "Fizz";
			}else if(inputNum%5==0){
				System.out.println("Buzz");
				return "Buzz";
			}
		}
		return "";

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//insteadFizzBuzzFrom1To100();
		System.out.println("===begin====" + translateTime(new
				Date()));
		Object synObject = new Object();
		synchronized (synObject){
			try {
				synObject.wait(1000);
			}catch (Exception e){

			}
		}
		System.out.println("=====end=====" + translateTime(new
				Date()));

	}

	private static String translateTime(Date date) {
		String msg="";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		msg+="["+sdf.format(date)+"]";
		return msg;
	}

}

package com.testng;

import org.testng.annotations.Test;

public class practiceTest {
	@Test(groups= {"Sanity"})
	public void sumof2() {
		System.out.println("sum of 2 items ");
	}
	
	@Test(groups= {"Sanity"})
	public void sumof3() {
		System.out.println("sum of 3 items is");
	}
	@Test(groups= {"smoke"})
	public void productof2() {
		System.out.println("product of  2 items is");
	}
	
	@Test(groups= {"smoke"})
	public void productof3() {
		System.out.println("multiplication of 3 items ");
	}
}

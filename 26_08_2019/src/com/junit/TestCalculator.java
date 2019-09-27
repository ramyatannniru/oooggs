package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;


public class TestCalculator extends TestCase{
	public TestCalculator()
	{
		super();
	}

	public TestCalculator(String name) {
		super(name);
		
		// TODO Auto-generated constructor stub
	}
	int x;
	int y;
	@Override
	protected void setUp() throws Exception
	{
		super.setUp();
		System.out.println("intialize the values ");
		x=10;
		y=20;
	}
	@Override
	protected void tearDown() throws Exception
	{
		super.tearDown();
	}
	@Test
	public void testGreaterThan() {
		int x=10;
	  int y=6;
		Calculator sc=new Calculator();
		int r=sc.greaterMethod(x, y);
		assertEquals(1,r);
	}
	@Test
	public void testAdMethod() {
		int x=10;
	  int y=6;
		Calculator sc=new Calculator();
		int r=sc.add(x, y);
		assertEquals(16,r);
	}

	
 public static TestSuite createTestSuite()
 {
		TestSuite  testsuite=new TestSuite("AllTest");
		testsuite.addTest(new TestCalculator("testGreaterThan"));
		testsuite.addTest( new TestCalculator("addMethod"));
		testsuite.addTest( new Myclass() );
		return testsuite;
 }
 public static void main(String args[])
 {
	 System.out.println("the test cases are");
	 junit.textui.TestRunner.run(createTestSuite());
 }
}


package com.junit;

public class Calculator {
    public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}

	private int x;
    private int y;
    
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
  public int greaterMethod( int x,int y)
  {
	  if(x>y)
	  {
	return 1;
	  
  }
	  else
	  {
		  return -1;
	  }
}
  public int add(int x,int y)
  {
  return x+y;
}
}
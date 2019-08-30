package sample.java;

public class MyDate {
	private int day;
	private int month;
	private int year;
	 
  
public int getDay()
  {
	  return day;
	  
  }
  public int getMonth(){
	  return month;
  }
  public int getYear() {
	  return year;
  }
  public boolean setDay(int d) {
	 
	  if(d<30) {
		  day=d;
		  return true;
	  }
	  else 
		  {
		  System.out.println("wrong");
		  return false;
		  }
	
  }
public boolean setMonth(int m) {
	  month=m;
	if(m>12) {
		  return true;
	  }
	  else 
		  {
		  System.out.println("wrong");
		  return false;
		  }
	
}
	
  
public boolean setYear(int y) {
	year=y;
	if(y>1990 && y<2019) {
		  return true;
	  }
	  else 
		  {
		  return false;
		  }
	  
}

}

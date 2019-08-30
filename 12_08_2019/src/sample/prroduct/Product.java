package sample.prroduct;

public class Product {
	private String rate;
	private static int item=0;
	 
	public Product() {
		
	}
 public Product(String rate)
{
	this.rate=rate;
	item++;
}
  public static int getCount() {
	  return item;
 }
 
  public String getDetails() {
	  return rate;
	  
  }
  public void set(String r)
  {
	   this.rate=r;
  }
}

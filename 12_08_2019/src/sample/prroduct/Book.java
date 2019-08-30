package sample.prroduct;

public class Book extends Product {
	private String bookName;
	private int bookId;
	public Book() {
		super();
		
	}
	public Book(String bookName,int bookId) {
		super();
		this.bookName=bookName;
		this.bookId=bookId;
		
		
	}
	public void set( String i,int id)
	{
	super.set("66");
	this.bookId=id;
	this.bookName=i;
		
	}
	@Override
	public String getDetails() {
		 return super.getDetails()+ bookId+bookName;
		
	}
	

}

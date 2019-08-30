package implement.java;

public class Monkey implements LivingThings{
  private String breed;
  private String name;
  public Monkey(String name,String breed) {
	  this.name=name;
	  this.breed=breed;
  }
  
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("this is monkey");
		
	}
	

}

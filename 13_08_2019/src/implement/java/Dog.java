package implement.java;

public class Dog implements LivingThings {
 private String breed;
 private String name;
 public Dog(String name, String breed) {
	 this.name=name;
	 this.breed=breed;
 }
 public  void setBreed(String breed) {
	 this.breed=breed;
	 
 }
 public  void setName(String name) {
	 this.name=name;
	 
 }
 public void createLivingthings()
 {
	 
    LivingThings livingthings=new LivingThings()
    		{
@Override
public void walk() {
	// TODO Auto-generated method stub
	System.out.println("this is dog");
}
 };

}
@Override
public void walk() {
	// TODO Auto-generated method stub
	
}

}

package comparable.com.example;
import java.util.Comparator;;

public class Contact implements Comparable<Contact>{
	public String name;
	public String email;
	public long mobile;
	public String address;
	
   
	public Contact() {
		// TODO Auto-generated constructor stub
		super();
	}
public Contact(String name,String email,long mobile,String address)
{
	super();
	this.name=name;
	this.email=email;
	this.address=address;
	this.mobile=mobile;
}

	

@Override
public int compareTo(Contact o) {
	Contact c=(Contact)o;
	if(this.getMobile() == c.getMobile())
		return 0;
	else if(this.getMobile() > c.getMobile())
		return -1;
	else
		return 1;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}




}

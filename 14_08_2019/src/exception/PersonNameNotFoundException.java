package exception;

public class PersonNameNotFoundException extends Throwable {

		private static final long serialVersionUID = -8713458596988799636L;
	private String message;
	public PersonNameNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonNameNotFoundException(String message) {
		super();
		this.setmessage(message);
		// TODO Auto-generated constructor stub
	}
	public void setmessage(String message) {
		// TODO Auto-generated method stub
		this.message=message;
		
	}
	
	public String getmessage() {
		return message;
	}
   
}

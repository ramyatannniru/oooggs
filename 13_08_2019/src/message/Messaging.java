package message;

public class Messaging {
     private String message;
     private static Messaging messaging;
      Messaging() {
    	 
     }
      private Messaging(String message) {
    	 this.message=message;
     }
     public void setMessage(String message) {
    	 this.message=message;
     }

public String toStringyfy()
{
	return "Messaging[message" +message+ "]";
	
}

public static Messaging createMessageObject() {
	if(messaging==null)
	{
		messaging =new Messaging();
	}
	return messaging;
}
public static Messaging createMessageObject(String i) {
	if(messaging==null)
	{
		messaging=new Messaging(i);
	}
	return messaging;
}
}

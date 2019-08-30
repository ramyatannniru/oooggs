package exception;

public class Addargs {

	public static void main(String args[]) {
		int sum=0;
		for(String a:args) {
			try {
				System.out.println(args[1]);
			sum=sum+Integer.parseInt(a);
		}
			
			catch(NumberFormatException nfe) {
		System.err.println(nfe.toString());
		//nfe.printStackTrace();
		//System.err.println(nfe.getCause().toString());
		System.out.println(nfe.getMessage());
		System.exit(0);
	}
			catch(Exception e) {
				System.out.println("error");
			}
			
}
		System.out.println(sum);
		}
}
